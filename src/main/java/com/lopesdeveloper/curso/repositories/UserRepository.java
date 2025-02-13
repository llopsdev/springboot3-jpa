package com.lopesdeveloper.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lopesdeveloper.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
