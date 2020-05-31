package com.joaosouza.customvalidation.resource.cliente.controller;

import com.joaosouza.customvalidation.resource.cliente.request.ClienteRequest;
import com.joaosouza.customvalidation.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController(value = "/cliente")
public class ClienteController {

	private final ClienteService service;
	
	@PostMapping
	public ResponseEntity<Void> insert(@Valid @RequestBody ClienteRequest request) {

		service.insert(request);

		return ResponseEntity.ok().build();
	}
}