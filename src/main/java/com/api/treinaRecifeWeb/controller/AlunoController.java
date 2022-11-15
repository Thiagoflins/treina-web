package com.api.treinaRecifeWeb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.treinaRecifeWeb.model.Aluno;

@RestController
public class AlunoController {

    @GetMapping("/Aluno")
    public Aluno listarAlunos(
        @RequestParam(name = "idAluno", required = false, defaultValue = "0") int idAluno,
        @RequestParam(name = "nome", required = false, defaultValue = "null") String nome,
        @RequestParam(name = "telefone", required = false, defaultValue = "null")String telefone,
        @RequestParam(name = "endereco", required = false, defaultValue = "null")String endereco,
        @RequestParam(name = "cpf", required = false, defaultValue = "null")String cpf) {
        return new Aluno(idAluno, nome, telefone, endereco, cpf); 
    }   
}
