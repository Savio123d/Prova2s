package com.Prova.prova.model;


import jakarta.persistence.*;

@Entity
@Table(name = "Aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private String matricula;


}
