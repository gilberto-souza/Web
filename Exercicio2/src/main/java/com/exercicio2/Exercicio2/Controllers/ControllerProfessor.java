package com.exercicio2.Exercicio2.Controllers;

import com.exercicio2.Exercicio2.Models.ModelProfessor;
import com.exercicio2.Exercicio2.Repository.RepositoryProfessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.*;

@RestController
@RequestMapping("/professor")
@Api(value = "Professor")
public class ControllerProfessor {

    @Autowired
    private RepositoryProfessor professorRepository;

    @GetMapping
    @ApiOperation(value = "Retorna uma lista de Professores")
    public List<ModelProfessor> getProfessores(){
        return professorRepository.findAll();
    }

    @PostMapping
    @ApiOperation(value = "Adicionar um Professor")
    public ModelProfessor createProfessor(@RequestBody ModelProfessor prof) {
        return professorRepository.save(prof);
    }
}