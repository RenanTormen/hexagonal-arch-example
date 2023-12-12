package dev.renantormen.hexagonalarch.adapters.outbound.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import dev.renantormen.hexagonalarch.application.core.domain.Endereco;

@FeignClient(name = "buscaCep", url = "https://viacep.com.br")
public interface BuscarEnderecoRest {

    @GetMapping("/ws/{cep}/json")
    ResponseEntity<Endereco> buscarPorCep(@PathVariable String cep);

}
