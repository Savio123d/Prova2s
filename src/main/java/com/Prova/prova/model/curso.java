package com.Prova.prova.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Cursos")
public class curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Integer cargaHoraria;

    private List alunos;

}
