package com.api.treinaRecifeWeb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Professor {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idProfessor;
    private String nome;
    private String telefone;
    private float valorHoraAula;

    public Professor() {

    }

    public Professor(int idProfessor, String nome, String telefone, float valorHoraAula) {
        this.idProfessor = idProfessor;
        this.nome = nome;
        this.telefone = telefone;
        this.valorHoraAula = valorHoraAula;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public float getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(float valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }
}
