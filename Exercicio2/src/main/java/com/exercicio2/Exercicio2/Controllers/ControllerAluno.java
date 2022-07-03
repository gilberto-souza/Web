package com.exercicio2.Exercicio2.controllers;

import java.util.List;

import com.exercicio2.Exercicio2.models.ModelAluno;
import com.exercicio2.Exercicio2.repository.RepositoryAluno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/aluno")
@Api(value = "Aluno")
public class ControllerAluno {

    @Autowired
    private RepositoryAluno alunoRepository;

    @GetMapping
    @ApiOperation(value = "Retorna uma lista de alunos")
    public List<ModelAluno> getAluno(){
        return alunoRepository.findAll();
    }

    @GetMapping("/{matricula}")
    @ApiOperation(value = "Busca um aluno pela sua matricula")
    public ModelAluno getalunoByMatricula (@PathVariable("matricula") Long matricula) {
        List<ModelAluno> alunos = alunoRepository.findAll();
        ModelAluno aluno = new ModelAluno();
        for(ModelAluno alun : alunos){
            if (alun.getMatricula() == matricula){
                aluno = alun;
                return alun;
            }
        }
        return aluno;
    }

    @PostMapping
    @ApiOperation(value = "Adicionar um Aluno")
    public ModelAluno createAluno(@RequestBody ModelAluno alunoa) {
        
        List<ModelAluno> alunos = alunoRepository.findAll();
        boolean veri = true;
        for(ModelAluno alun : alunos){
            if (alun.getMatricula() == alunoa.getMatricula() || alun.getEmail() == alunoa.getEmail()){
                veri = false;
            }
        }
        if (veri){
            return alunoRepository.save(alunoa);
        }
        else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Exclui um aluno a partir do seu id")
    public void deleteAluno(@PathVariable Long id) {
        alunoRepository.delete(alunoRepository.findById(id).get());
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Atualiza um aluno a partir do seu identificador")
    public ModelAluno updateAluno(@PathVariable("id") Long id, @RequestBody ModelAluno alunoa) {
        List<ModelAluno> alunos = alunoRepository.findAll();
        boolean veri = true;
        for(ModelAluno alun : alunos){
            if (alun.getMatricula() == alunoa.getMatricula() || alun.getEmail() == alunoa.getEmail() && alun.getId()!=alunoa.getId()){
                veri = false;
            }
        }
        if (veri){
            return alunoRepository.save(alunoa);
        }
        else {
            return null;
        }
    }    
}