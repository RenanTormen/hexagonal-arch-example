package dev.renantormen.adapters.inbound;

import dev.renantormen.adapters.inbound.mapper.UsuarioMapper;
import dev.renantormen.adapters.inbound.request.UsuarioRequest;
import dev.renantormen.application.core.domain.Usuario;
import dev.renantormen.application.ports.in.SalvarUsuarioPortIn;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/usuario")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioController {
    
    @Inject //NOSONAR
    private SalvarUsuarioPortIn salvarUsuarioPortIn;

    @Inject //NOSONAR
    private UsuarioMapper usuarioMapper;

    @POST
    public Usuario salvarUsuario(UsuarioRequest usuarioRequest) {
        var newUser = usuarioMapper.usuarioRequestToUsuario(usuarioRequest);
        return salvarUsuarioPortIn.salvarUsuario(newUser, usuarioRequest.getCep());
    }

}
