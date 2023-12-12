package dev.renantormen.application.core.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco {
    private String cep;
    private String logradouro;
    private String uf;
}
