package dev.renantormen.hexagonalarch.adapters.inbound.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import dev.renantormen.hexagonalarch.adapters.inbound.entity.EnderecoEntity;
import dev.renantormen.hexagonalarch.application.core.domain.Endereco;

@Component
public class EnderecoMapper {

    public EnderecoEntity enderecoToEnderecoEntity(Endereco endereco) {
        EnderecoEntity newEntity = new EnderecoEntity();
        BeanUtils.copyProperties(endereco, newEntity);
        return newEntity;
    }

}
