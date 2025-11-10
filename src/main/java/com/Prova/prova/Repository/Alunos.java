package com.Prova.prova.Repository;

import com.Prova.prova.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Alunos extends JpaRepository<Aluno, Long> {

}
