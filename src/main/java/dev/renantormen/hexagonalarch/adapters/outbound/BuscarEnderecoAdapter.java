package dev.renantormen.hexagonalarch.adapters.outbound;

import org.springframework.stereotype.Component;

import dev.renantormen.hexagonalarch.adapters.outbound.rest.BuscarEnderecoRest;
import dev.renantormen.hexagonalarch.application.core.domain.Endereco;
import dev.renantormen.hexagonalarch.application.ports.out.BuscarEnderecoPort;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class BuscarEnderecoAdapter implements BuscarEnderecoPort {

    private final BuscarEnderecoRest buscarEnderecoRest;

    @Override
    public Endereco buscarEnderecoPorCep(String cep) {
        return buscarEnderecoRest.buscarPorCep(cep).getBody();
    }

}
