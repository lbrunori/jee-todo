package com.lucasbrunori.persistence;

import com.lucasbrunori.domain.ToDo;

import java.sql.ResultSet;

public class TodoMapper implements ObjectMapper<ToDo> {
    @Override
    public ToDo map(ResultSet rs, Integer rowNumber) {
        return null;
    }
}
