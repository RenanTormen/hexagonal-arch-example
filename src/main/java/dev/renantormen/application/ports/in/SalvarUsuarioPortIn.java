package dev.renantormen.application.ports.in;

import dev.renantormen.application.core.domain.Usuario;

public interface SalvarUsuarioPortIn {
    Usuario salvarUsuario(Usuario usuario, String cep);
}
