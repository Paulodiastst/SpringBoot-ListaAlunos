package br.com.techinnovation.academicnet.controller;

import java.time.Instant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.techinnovation.academicnet.model.Aluno;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

	@GetMapping
	public Aluno getInfo() {
		Aluno aluno = new Aluno(1L, "José da Silva", "3333-4444", "jose@teste.com.br", Instant.now());
		return aluno;
	}

}
