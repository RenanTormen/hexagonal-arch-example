package dev.renantormen.hexagonalarch.application.ports.in;

import org.springframework.stereotype.Component;

import dev.renantormen.hexagonalarch.application.core.domain.Usuario;

@Component
public interface SalvarUsuarioPortIn {
    Usuario salvarUsuario(Usuario usuario, String cep);
}
