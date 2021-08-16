package com.alura.forum.controller.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.alura.forum.modelo.Curso;
import com.alura.forum.modelo.Topico;
import com.alura.forum.repository.CursoRepository;

public class TopicoForm {

	@NotBlank @NotNull
	private String titulo;
	
	@NotBlank @NotNull
	private String mensagem;
	
	@NotBlank @NotNull
	private String nomeCurso;
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public Topico converter(CursoRepository repository) {
		Curso curso = repository.findByNome(nomeCurso);
		return new Topico(titulo, mensagem, curso);
	}
}
