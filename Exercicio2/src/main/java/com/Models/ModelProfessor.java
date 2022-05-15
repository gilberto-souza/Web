package com.Models;

import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ModelProfessor {
    
    private String matricula;
    private String nome;
    private String email;
    private String formacao;

    public ModelProfessor(String nome, String email, String formacao) {
        this.matricula = UUID.randomUUID().toString();
        this.nome = nome;
        this.email = email;
        this.formacao = formacao;
    }
    
}
