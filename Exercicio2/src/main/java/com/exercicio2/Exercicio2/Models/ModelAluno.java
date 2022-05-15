package com.exercicio2.Exercicio2.Models;
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
@Table(name = "professor")
public class ModelAluno {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long matricula;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    public ModelAluno(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}
