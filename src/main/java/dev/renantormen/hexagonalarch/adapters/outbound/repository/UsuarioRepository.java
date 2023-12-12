package dev.renantormen.hexagonalarch.adapters.outbound.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.renantormen.hexagonalarch.adapters.inbound.entity.UsuarioEntity;


public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {}
