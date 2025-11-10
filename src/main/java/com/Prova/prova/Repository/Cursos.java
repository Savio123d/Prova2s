package com.Prova.prova.Repository;

import com.Prova.prova.model.Aluno;
import com.Prova.prova.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Cursos extends JpaRepository<Curso,Long> {

}
