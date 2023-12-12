package dev.renantormen.adapters.inbound.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import dev.renantormen.adapters.inbound.entity.UsuarioEntity;
import dev.renantormen.adapters.inbound.request.UsuarioRequest;
import dev.renantormen.application.core.domain.Usuario;

@Mapper(componentModel = "cdi")
public interface UsuarioMapper {

    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    Usuario usuarioRequestToUsuario(UsuarioRequest usuarioRequest);

    UsuarioEntity usuarioToUsuarioEntity(Usuario usuario);

    Usuario usuarioEntityToUsuario(UsuarioEntity usuarioEntity);
}
