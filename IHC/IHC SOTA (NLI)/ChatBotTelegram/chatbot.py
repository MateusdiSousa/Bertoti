import telebot
import requests
from telebot import types

# Substitua 'TOKEN' pelo token gerado pelo BotFather.
token = '6964788071:AAHkUP7_WdMYolRnV8G0x5iGCUfN1ad4IVg'

url = 'https://newsapi.org/v2/top-headlines?country=br&apiKey='

token_news = '37571a699beb45f0a0a70d5e74541c30'

noticias = requests.get(url+token_news).json()

contador = 0

bot = telebot.TeleBot(token)

# Função de comando "/start"
@bot.message_handler(commands=['start'])
def start(message):
    bot.reply_to(message, '''Olá! Eu sou um ChatBot. Caso queira ver notícias digite 1''')
    global noticias
    global contador
    
    noticias = requests.get(url+token_news).json()
    contador = 0
    

# Função mostrar notícias
@bot.message_handler(func=lambda message: message.text.isdigit())
def news(message):    

    # Indice da notícia que será mostrada
    global contador

    if(message.text == '1'):
        if contador < len(noticias['articles']):
            # Enviar Notícias para o usuário
            response = noticias['articles'][contador]
            author = response['author']
            title = response['title']
            url_news = response['url']
            bot.reply_to(message,'''Autor: {}
    Título: {}
    Site da notícia: {}'''.format(author, title, url_news) )
            
            contador += 1
        else:
            # Caso acabe as notícias do Dia
            bot.reply_to(message, 'Não há mais noticias disponíveis!')
        
# Inicia o bot
bot.polling()
