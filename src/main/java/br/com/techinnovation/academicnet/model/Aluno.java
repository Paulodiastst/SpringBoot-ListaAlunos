package br.com.techinnovation.academicnet.model;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Aluno {

	private Long matricula;
	private String nome;
	private String telefone;
	private String email;
	private Instant dataCadastro;

}