package com.Models;

import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ModelTurma {
    
    private String disciplina;
    private String sala;

    public ModelTurma(String disciplina, String sala) {
        this.disciplina = disciplina;
        this.sala = sala;
    }
    
}
