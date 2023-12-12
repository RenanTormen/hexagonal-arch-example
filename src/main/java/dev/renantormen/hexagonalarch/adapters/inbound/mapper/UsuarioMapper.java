package dev.renantormen.hexagonalarch.adapters.inbound.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import dev.renantormen.hexagonalarch.adapters.inbound.entity.UsuarioEntity;
import dev.renantormen.hexagonalarch.adapters.inbound.request.UsuarioRequest;
import dev.renantormen.hexagonalarch.application.core.domain.Usuario;

@Component
public class UsuarioMapper {

    public Usuario usuarioRequestToUsuario(UsuarioRequest usuarioRequest) {
        Usuario newEntity = new Usuario();
        BeanUtils.copyProperties(usuarioRequest, newEntity);
        return newEntity;
    }

    public UsuarioEntity usuarioToUsuarioEntity(Usuario usuario) {
        UsuarioEntity newEntity = new UsuarioEntity();
        BeanUtils.copyProperties(usuario, newEntity);
        return newEntity;
    }

    public Usuario usuarioEntityToUsuario(UsuarioEntity usuarioEntity) {
        Usuario newEntity = new Usuario();
        BeanUtils.copyProperties(usuarioEntity, newEntity);
        return newEntity;
    }
}
