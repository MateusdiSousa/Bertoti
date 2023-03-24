/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Mateus
 */
public class FactoryConnection {
    public Connection getConnection(){
        String sql = "jdbc:mysql://localhost/bertoti";
        try {
            return DriverManager.getConnection(sql,"root","");
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null,"Erro ao conectar no banco de dados"+ e.getMessage());
        }
        return null;
    }
}
