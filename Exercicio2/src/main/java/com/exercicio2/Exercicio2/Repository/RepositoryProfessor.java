package com.exercicio2.Exercicio2.Repository;

import com.exercicio2.Exercicio2.Models.ModelProfessor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryProfessor extends JpaRepository<ModelProfessor, Long> {
    @Query(value = "SELECT * FROM USERS WHERE EMAIL_ADDRESS = ?1", nativeQuery = true)
    ModelProfessor findBymatricula(Long matricula);
}
