package com.exercicio2.Exercicio2.Repository;

import com.exercicio2.Exercicio2.Models.ModelProjeto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryProjeto extends JpaRepository<ModelProjeto, Long> {}
