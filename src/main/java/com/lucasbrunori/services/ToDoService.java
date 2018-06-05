package com.lucasbrunori.services;

import com.lucasbrunori.domain.ToDo;

import java.util.List;

public interface ToDoService {

    List<ToDo> findAll();

    ToDo find();

    ToDo create(ToDo t);

    void remove(ToDo t);

    ToDo update(ToDo t);
}
