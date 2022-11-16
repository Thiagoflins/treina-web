package com.api.treinaRecifeWeb.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Turma {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idTurma;
    //private int idAluno = Aluno.getIdAluno();
    //private Integer idProfessor = Professor.idProfessor;
    //private Integer idCurso = Curso.idCurso;
    private float valor;

    public Turma(){

    }
 
    public Turma(int idTurma, float valor) {
        this.idTurma = idTurma;
        this.valor = valor;
    }

    public int getIdTurma() {
        return idTurma;
    }
    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
