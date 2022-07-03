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
@Table(name = "projeto")
public class ModelProjeto {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "Descricao")
    private String descricao;

    @Column(name = "matriculaProf")
    private Long matriculaProf;

    public ModelProjeto(String nome, String descricao, Long matriculaProf) {
        this.nome = nome;
        this.descricao = descricao;
        this.matriculaProf = matriculaProf;
    }
}
