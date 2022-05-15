package com.Models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "turma")
public class ModelTurma {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "disciplina")
    private String disciplina;

    @Column(name = "sala")
    private String sala;

    public ModelTurma(String nome, String sala) {
        this.disciplina = disciplina;
        this.sala = sala;
    }
    
}
