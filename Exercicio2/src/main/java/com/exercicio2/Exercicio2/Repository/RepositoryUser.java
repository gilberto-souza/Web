package com.exercicio2.Exercicio2.Repository;

import com.exercicio2.Exercicio2.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUser extends JpaRepository<User, Long> {

    User findByUsername(String username);
    
}