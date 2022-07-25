package br.com.techinnovation.academicnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.techinnovation.academicnet.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
