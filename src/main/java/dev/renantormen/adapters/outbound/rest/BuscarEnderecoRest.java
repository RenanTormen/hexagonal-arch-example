package dev.renantormen.adapters.outbound.rest;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import dev.renantormen.application.core.domain.Endereco;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("ws")
@RegisterRestClient(baseUri = "https://viacep.com.br")
public interface BuscarEnderecoRest {
    @GET
    @Path("/{cep}/json")
    Endereco buscarPorCep(@PathParam("cep") String cep);
}
