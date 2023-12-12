package dev.renantormen.application.core.service;

import dev.renantormen.application.core.domain.Usuario;
import dev.renantormen.application.ports.in.SalvarUsuarioPortIn;
import dev.renantormen.application.ports.out.BuscarEnderecoPort;
import dev.renantormen.application.ports.out.SalvarUsuarioPortOut;

public class SalvarUsuarioService implements SalvarUsuarioPortIn {

    private final SalvarUsuarioPortOut salvarUsuarioPortOut;

    private final BuscarEnderecoPort buscarEnderecoPort;

    public SalvarUsuarioService(SalvarUsuarioPortOut salvarUsuarioPortOut, BuscarEnderecoPort buscarEnderecoPort) {
        this.salvarUsuarioPortOut = salvarUsuarioPortOut;
        this.buscarEnderecoPort = buscarEnderecoPort;
    }

    @Override
    public Usuario salvarUsuario(Usuario usuario, String cep) {
        var endereco = buscarEnderecoPort.buscarEnderecoPorCep(cep);
        return salvarUsuarioPortOut.salvarUsuario(
                Usuario.builder()
                        .nome(usuario.getNome())
                        .endereco(endereco)
                        .build()
            );
    }

}
