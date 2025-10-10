package com.guilherme_delfino.todolist.repository;

import com.guilherme_delfino.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
