package dev.renantormen.adapters.outbound;

import dev.renantormen.adapters.inbound.mapper.EnderecoMapper;
import dev.renantormen.adapters.inbound.mapper.UsuarioMapper;
import dev.renantormen.adapters.outbound.repository.UsuarioRepository;
import dev.renantormen.application.core.domain.Usuario;
import dev.renantormen.application.ports.out.SalvarUsuarioPortOut;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class SalvarUsuarioAdapter implements SalvarUsuarioPortOut {

    private UsuarioMapper usuarioMapper;

    private EnderecoMapper enderecoMapper;

    private UsuarioRepository usuarioRepository;

    @Inject
    public SalvarUsuarioAdapter(UsuarioRepository usuarioRepository, UsuarioMapper usuarioMapper,
            EnderecoMapper enderecoMapper) {
        this.usuarioRepository = usuarioRepository;
        this.usuarioMapper = usuarioMapper;
        this.enderecoMapper = enderecoMapper;
    }

    @Override
    @Transactional
    public Usuario salvarUsuario(Usuario usuario) {

        var enderecoEntity = enderecoMapper.enderecoToEnderecoEntity(usuario.getEndereco());
        var usuarioEntity = usuarioMapper.usuarioToUsuarioEntity(usuario);

        usuarioEntity.setEndereco(enderecoEntity);

        usuarioRepository.persist(usuarioEntity);

        return usuarioMapper.usuarioEntityToUsuario(usuarioEntity);
    }

}
