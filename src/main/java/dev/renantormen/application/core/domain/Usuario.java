package dev.renantormen.application.core.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Usuario {

    private String nome;
    private Endereco endereco;

}
