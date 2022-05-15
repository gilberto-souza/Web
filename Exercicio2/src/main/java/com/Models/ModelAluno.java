package com.Models;

import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ModelAluno {
    private String matricula;
    private String nome;
    private String email;

    public ModelAluno(String nome, String email) {
        this.matricula = UUID.randomUUID().toString();
        this.nome = nome;
        this.email = email;
    }
}
