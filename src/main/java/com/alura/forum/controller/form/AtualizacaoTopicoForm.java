package com.alura.forum.controller.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.alura.forum.modelo.Topico;
import com.alura.forum.repository.TopicoRepository;

public class AtualizacaoTopicoForm {
	
	@NotBlank @NotNull
	private String titulo;
	
	@NotBlank @NotNull
	private String mensagem;

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

	public Topico atualizar(Long id, TopicoRepository repository) {
		Topico topico = repository.getOne(id);
		topico.setTitulo(this.titulo);
		topico.setMensagem(this.mensagem);
		return topico;
	}
}
