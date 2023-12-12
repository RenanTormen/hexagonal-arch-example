package dev.renantormen.adapters.inbound.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import dev.renantormen.adapters.inbound.entity.EnderecoEntity;
import dev.renantormen.application.core.domain.Endereco;

@Mapper(componentModel = "cdi")
public interface EnderecoMapper {

    EnderecoMapper INSTANCE = Mappers.getMapper(EnderecoMapper.class);

    public EnderecoEntity enderecoToEnderecoEntity(Endereco endereco);

}
