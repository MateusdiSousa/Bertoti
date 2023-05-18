/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bertoti;

/**
 *
 * @author Mateus
 */
public class Bertoti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro corolla = new Carro(1, "Corolla", 2000, "Toyota", 15000.00);
        
        Cliente bertoti = new Cliente(222, "Bertoti", 2222, 3333, 98822);
        
        Vendas venda = new Vendas();

        venda = bertoti.comprarCarro(corolla);
        System.out.println(venda);
    }
    
}
