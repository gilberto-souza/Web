package com.exercicio2.Exercicio2.Controllers;

import com.exercicio2.Exercicio2.Models.ModelAluno;
import com.exercicio2.Exercicio2.Models.ModelProjeto;
import com.exercicio2.Exercicio2.Models.ModelTurma;
import com.exercicio2.Exercicio2.Repository.RepositoryProfessor;
import com.exercicio2.Exercicio2.Repository.RepositoryProjeto;
import com.exercicio2.Exercicio2.Repository.RepositoryTurma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.*;

@RestController
@RequestMapping("/projeto")
@Api(value = "Projeto")
public class ControllerProjeto {

    @Autowired
    private RepositoryProjeto projetoRepository;

    @Autowired
    private RepositoryTurma alunoRepository;

    @Autowired
    private RepositoryProfessor professorRepository;

    @GetMapping
    @ApiOperation(value = "Retorna uma lista de Projetos")
    public List<ModelProjeto> getProjeto(){
        return projetoRepository.findAll();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Busca um projeto pelo seu id")
    public Optional<ModelProjeto> getProjetoById(@PathVariable Long id) {
        return projetoRepository.findById(id);
    }

    @PostMapping
    @ApiOperation(value = "Adicionar um Projeto")
    public ModelProjeto createProjeto(@RequestBody ModelProjeto projeto) {
        return projetoRepository.save(projeto);
    }

    
}