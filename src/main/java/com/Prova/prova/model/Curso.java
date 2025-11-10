package com.Prova.prova.model;


import com.Prova.prova.enums.Status;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Integer cargaHoraria;

    private List alunos;

    Status StatusAlunos;
}
