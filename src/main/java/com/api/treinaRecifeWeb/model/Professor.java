package com.api.treinaRecifeWeb.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Professor {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public static Integer idProfessor;
    String nome;
    String telefone;
    float valorHoraAula;
}
