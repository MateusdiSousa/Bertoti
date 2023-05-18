/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bertoti;
import java.sql.Date;
;

/**
 *
 * @author Mateus
 */
public class Vendas {
    private Cliente cliente;
    private Carro carro;
    private double valorVenda;
    private Date dataVenda;

    public Vendas() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    public String toString(){
        System.out.println("Cliente: "+cliente.getNome());
        System.out.println("Carro: "+carro.getModelo());
        System.out.println("Valor da venda: "+valorVenda);
        return "Data da Venda: "+dataVenda;
    }
}
