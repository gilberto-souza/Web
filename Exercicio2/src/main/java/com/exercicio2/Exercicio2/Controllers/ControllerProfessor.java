package com.exercicio2.Exercicio2.Controllers;

import com.exercicio2.Exercicio2.Models.ModelProfessor;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/professor")
public class ControllerProfessor {
 
    @GetMapping
    public String getControllerProfessor() {
        return "Professor";
    }

    @PostMapping
    public ModelProfessor CreateProfessor(@RequestBody ModelProfessor professor) {
        ModelProfessor newProfessor = new ModelProfessor();
        return newProfessor;
    }  
}