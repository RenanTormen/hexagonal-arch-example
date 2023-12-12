package dev.renantormen.application.ports.out;

import dev.renantormen.application.core.domain.Endereco;

public interface BuscarEnderecoPort {
    Endereco buscarEnderecoPorCep(String cep);
}
