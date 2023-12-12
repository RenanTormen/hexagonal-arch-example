package dev.renantormen.hexagonalarch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.renantormen.hexagonalarch.adapters.outbound.BuscarEnderecoAdapter;
import dev.renantormen.hexagonalarch.adapters.outbound.SalvarUsuarioAdapter;
import dev.renantormen.hexagonalarch.application.core.service.SalvarUsuarioService;

@Configuration
public class Config {

    @Bean
    SalvarUsuarioService salvarUsuarioService(SalvarUsuarioAdapter salvarUsuarioAdapter, BuscarEnderecoAdapter buscarEnderecoAdapter) {
        return new SalvarUsuarioService(salvarUsuarioAdapter, buscarEnderecoAdapter);
    }

}
