/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Mateus
 */
public class Aluno {
    private String nome;
    private String turma;
    private int ra;

    public String getNome() {
        return nome;
    }

    public String getTurma() {
        return turma;
    }

    public int getRa() {
        return ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, String turma, int ra) {
        this.nome = nome;
        this.turma = turma;
        this.ra = ra;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
    
    
}
