package com.lopesdeveloper.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lopesdeveloper.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>{

}
