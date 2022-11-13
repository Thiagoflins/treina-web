package com.api.treinaRecifeWeb.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Turma {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public static Integer idTurma;
    Integer idAluno = Aluno.idAluno;
    Integer idProfessor = Professor.idProfessor;
    Integer idCurso = Curso.idCurso;
    float valor;
    
}
