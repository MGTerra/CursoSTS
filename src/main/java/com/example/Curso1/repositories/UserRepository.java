package com.example.Curso1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Curso1.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
