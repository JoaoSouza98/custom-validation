package com.joaosouza.customvalidation.data;

import com.joaosouza.customvalidation.domain.enums.TipoCliente;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    @Enumerated(EnumType.STRING)
    private TipoCliente tipo;

    private String documento;
}

