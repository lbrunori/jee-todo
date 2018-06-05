package com.lucasbrunori.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TO_DO")
public class ToDo {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @NotNull
    private String title;
    @NotNull
    @Size(min = 20, max = 2000)
    private String description;

    public ToDo() {
        id = -1L;
        title = "Default title";
        description = "Default description";
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
