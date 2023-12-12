package dev.renantormen.hexagonalarch.application.ports.out;

import dev.renantormen.hexagonalarch.application.core.domain.Endereco;

public interface BuscarEnderecoPort {
    Endereco buscarEnderecoPorCep(String cep);
}
