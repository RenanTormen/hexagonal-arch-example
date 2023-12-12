package dev.renantormen.application.ports.out;

import dev.renantormen.application.core.domain.Usuario;

public interface SalvarUsuarioPortOut {
    Usuario salvarUsuario(Usuario usuario);
}
