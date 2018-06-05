package com.lucasbrunori.services;

import com.lucasbrunori.domain.ToDo;

import java.util.ArrayList;
import java.util.List;

public class ToDoServiceImpl implements ToDoService {
    @Override
    public List<ToDo> findAll() {
        return new ArrayList<ToDo>();
    }

    @Override
    public ToDo find() {
        return new ToDo();
    }

    @Override
    public ToDo create(ToDo t) {
        return new ToDo();
    }

    @Override
    public void remove(ToDo t) {

    }

    @Override
    public ToDo update(ToDo t) {
        return new ToDo();
    }
}
