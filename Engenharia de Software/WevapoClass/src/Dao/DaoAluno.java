/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import Factory.FactoryConnection;
import Models.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Mateus
 */
public class DaoAluno {
    Connection conn;
    FactoryConnection connection;
    
    public DaoAluno(){
        connection = new FactoryConnection();
        conn = connection.getConnection();
    }
    
    public void adicionar(Aluno aluno){
        String sql = "INSERT INTO bertoti.aluno(nome,turma, ra) VALUES"+"(?,?,?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getTurma());
            stmt.setInt(3, aluno.getRa());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null,"Aluno adicionado"+ stmt);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao adicionar aluno"+ e.getMessage());
        }
    }
}
