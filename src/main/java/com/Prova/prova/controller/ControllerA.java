package com.Prova.prova.controller;

import com.Prova.prova.model.Aluno;
import com.Prova.prova.service.ServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController
public class ControllerA {


    @Autowired
    private  ServiceA serviceA;


//    @GetMapping
//    private ResponseEntity<List<Aluno>> listarLivros(){
//
//    }


}
