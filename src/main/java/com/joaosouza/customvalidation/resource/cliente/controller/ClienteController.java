package com.joaosouza.customvalidation.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ClienteController {
	
	@PostMapping
	public ResponseEntity insert(@Valid @RequestBody ClienteRequest request) {



		return ResponseEntity.ok().build();
	}
}
