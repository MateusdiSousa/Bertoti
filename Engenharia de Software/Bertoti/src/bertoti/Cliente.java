/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bertoti;

import java.time.Instant;
import java.time.LocalDate;

/**
 *
 * @author Mateus
 */
public class Cliente {
    private int idCliente;
    private String nome;
    private double cpf;
    private double rg;
    private double telefone;

    public Cliente(int idCliente, String nome, int cpf, int rg, int telefone) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
    }

    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public double getRg() {
        return rg;
    }

    public void setRg(double rg) {
        this.rg = rg;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }
    
    public Vendas comprarCarro(Carro carro){
        Vendas venda = new Vendas();
        venda.setCarro(carro);
        venda.setCliente(this);
        venda.setValorVenda(carro.getPreco());
        venda.setDataVenda(java.sql.Date.valueOf(LocalDate.now()));
        return venda;
    }
}
