package com.api.treinaRecifeWeb.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.treinaRecifeWeb.model.Aluno;
import com.api.treinaRecifeWeb.repository.AlunoRepository;

@RestController
public class AlunoController {

    @GetMapping("/novoAluno")
    public Aluno novoAluno(
        @RequestParam(name = "idAluno", required = false, defaultValue = "0") int idAluno,
        @RequestParam(name = "nome", required = false, defaultValue = "null") String nome,
        @RequestParam(name = "telefone", required = false, defaultValue = "null")String telefone,
        @RequestParam(name = "endereco", required = false, defaultValue = "null")String endereco,
        @RequestParam(name = "cpf", required = false, defaultValue = "null")String cpf) {
        return new Aluno(idAluno, nome, telefone, endereco, cpf); 
    }   

    @GetMapping("/aluno")
    public Iterable<Aluno> listarTodosAluno(){
        return alunoRepository.findAll();
    }

    @PostMapping("/aluno")
    public Aluno criarAluno(@RequestBody Aluno aluno){
        return alunoRepository.save(aluno);
    }

    @Autowired
    private AlunoRepository alunoRepository;
}
