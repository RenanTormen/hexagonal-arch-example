package dev.renantormen.adapters.outbound.repository;

import dev.renantormen.adapters.inbound.entity.UsuarioEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsuarioRepository implements PanacheRepository<UsuarioEntity> {}
