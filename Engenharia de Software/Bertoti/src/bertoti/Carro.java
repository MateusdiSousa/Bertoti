/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bertoti;

/**
 *
 * @author Mateus
 */
public class Carro {
    private int idCarro;
    private String modelo;
    private int anoFabricacao;
    private String fabricante;
    private double preco;

    public Carro(int idCarro, String modelo, int anoFabricacao, String fabricante, double preco) {
        this.idCarro = idCarro;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
