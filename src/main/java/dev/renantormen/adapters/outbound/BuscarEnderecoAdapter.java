package dev.renantormen.adapters.outbound;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import dev.renantormen.adapters.outbound.rest.BuscarEnderecoRest;
import dev.renantormen.application.core.domain.Endereco;
import dev.renantormen.application.ports.out.BuscarEnderecoPort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class BuscarEnderecoAdapter implements BuscarEnderecoPort {

    @Inject //NOSONAR
    @RestClient
    private BuscarEnderecoRest buscarEnderecoRest;

    @Override
    public Endereco buscarEnderecoPorCep(String cep) {
        return buscarEnderecoRest.buscarPorCep(cep);
    }

}
