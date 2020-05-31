package com.joaosouza.customvalidation.service;

import com.joaosouza.customvalidation.data.ClienteRepository;
import com.joaosouza.customvalidation.resource.cliente.request.ClienteRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

    public void insert(ClienteRequest request) { repository.save(ClienteRequest.to(request)); }
}