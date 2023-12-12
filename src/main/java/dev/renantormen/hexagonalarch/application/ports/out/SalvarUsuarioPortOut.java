package dev.renantormen.hexagonalarch.application.ports.out;

import dev.renantormen.hexagonalarch.application.core.domain.Usuario;

public interface SalvarUsuarioPortOut {
    Usuario salvarUsuario(Usuario usuario);
}
