package com.lucasbrunori.persistence;

import java.sql.ResultSet;

public interface ObjectMapper<T> {

    T map(ResultSet rs, Integer rowNumber);
}
