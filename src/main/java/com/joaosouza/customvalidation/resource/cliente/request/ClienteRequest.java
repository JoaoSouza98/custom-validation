package com.joaosouza.customvalidation.controller;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.joaosouza.customvalidation.domain.enums.TipoCliente;

public class ClienteRequest {
	
	@NotBlank
	@Size(min = 5, max = 120)
	public final String nome;

	@NotBlank
	@Email
	public final String email;

	@NotNull
	public final TipoCliente tipo;
	
	@NotBlank
	public final String documento;
	
	public ClienteRequest(String nome, String email, TipoCliente tipo, String documento) {
		this.nome = nome;
		this.email = email;
		this.tipo = tipo;
		this.documento = documento;
	}
}
