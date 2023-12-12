package dev.renantormen.config;

import dev.renantormen.application.core.service.SalvarUsuarioService;
import dev.renantormen.application.ports.out.BuscarEnderecoPort;
import dev.renantormen.application.ports.out.SalvarUsuarioPortOut;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Default;

@Dependent
public class Config {
    @Default
    public SalvarUsuarioService salvarUsuarioService(SalvarUsuarioPortOut salvarUsuarioPortIn, BuscarEnderecoPort buscarEnderecoPort) {
        return new SalvarUsuarioService(salvarUsuarioPortIn, buscarEnderecoPort);
    }
}
