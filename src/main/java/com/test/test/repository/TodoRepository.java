package com.test.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test.model.Todo;


public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findAll();

    Todo findById(int id);
    
}
