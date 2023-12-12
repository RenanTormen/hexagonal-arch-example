package dev.renantormen.hexagonalarch.adapters.inbound;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.renantormen.hexagonalarch.adapters.inbound.mapper.UsuarioMapper;
import dev.renantormen.hexagonalarch.adapters.inbound.request.UsuarioRequest;
import dev.renantormen.hexagonalarch.application.core.domain.Usuario;
import dev.renantormen.hexagonalarch.application.ports.in.SalvarUsuarioPortIn;
import lombok.AllArgsConstructor;


@RestController
@RequestMapping(path = "/usuario", produces = "application/json", consumes = "application/json")
@AllArgsConstructor
public class UsuarioController {
    
    private SalvarUsuarioPortIn salvarUsuarioPortIn;

    private UsuarioMapper usuarioMapper;

    @PostMapping
    public Usuario salvarUsuario(@RequestBody UsuarioRequest usuarioRequest) {
        var newUser = usuarioMapper.usuarioRequestToUsuario(usuarioRequest);
        return salvarUsuarioPortIn.salvarUsuario(newUser, usuarioRequest.getCep());
    }

}
