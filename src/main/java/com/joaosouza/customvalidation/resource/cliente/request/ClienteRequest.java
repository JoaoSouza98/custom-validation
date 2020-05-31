package com.joaosouza.customvalidation.resource.cliente.request;

import com.joaosouza.customvalidation.data.Cliente;
import com.joaosouza.customvalidation.domain.enums.TipoCliente;
import lombok.Builder;
import lombok.Value;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Value
@Builder
public class ClienteRequest {
	
	@NotBlank
	@Size(min = 5, max = 120)
	String nome;

	@NotBlank
	@Email
	String email;

	@NotNull
	TipoCliente tipo;
	
	@NotBlank
	String documento;

	public static Cliente to(ClienteRequest obj) {
		return Cliente.builder()
				.nome(obj.nome)
				.documento(obj.documento)
				.email(obj.email)
				.tipo(obj.tipo).build();
	}
}