package dev.renantormen.adapters.inbound.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class UsuarioRequest {
    private final String nome;
    private final String cep;
}
