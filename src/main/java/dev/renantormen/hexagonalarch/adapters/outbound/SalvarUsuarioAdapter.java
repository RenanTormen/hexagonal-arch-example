package dev.renantormen.hexagonalarch.adapters.outbound;

import org.springframework.stereotype.Component;

import dev.renantormen.hexagonalarch.adapters.inbound.mapper.EnderecoMapper;
import dev.renantormen.hexagonalarch.adapters.inbound.mapper.UsuarioMapper;
import dev.renantormen.hexagonalarch.adapters.outbound.repository.UsuarioRepository;
import dev.renantormen.hexagonalarch.application.core.domain.Usuario;
import dev.renantormen.hexagonalarch.application.ports.out.SalvarUsuarioPortOut;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SalvarUsuarioAdapter implements SalvarUsuarioPortOut {

    private UsuarioMapper usuarioMapper;

    private EnderecoMapper enderecoMapper;

    private UsuarioRepository usuarioRepository;


    @Override
    @Transactional
    public Usuario salvarUsuario(Usuario usuario) {

        var enderecoEntity = enderecoMapper.enderecoToEnderecoEntity(usuario.getEndereco());
        var usuarioEntity = usuarioMapper.usuarioToUsuarioEntity(usuario);

        usuarioEntity.setEndereco(enderecoEntity);

        usuarioRepository.save(usuarioEntity);

        return usuarioMapper.usuarioEntityToUsuario(usuarioEntity);
    }

}
