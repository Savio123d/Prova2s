package com.Prova.prova.service;

import com.Prova.prova.Repository.Alunos;
import com.Prova.prova.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceA {

    @Autowired
    private  Alunos alunos;

    public ServiceA(Alunos alunos) {
        this.alunos = alunos;
    }
    public List<Aluno> findAll(){
        return  alunos.findAll();
    }
    public Aluno criarLivro(Aluno aluno){
        return alunos.save(aluno);
    }

    public void deletarLivro(Long id){
        alunos.deleteById(id);
    }

}
