package dev.renantormen.adapters.inbound.entity;

import dev.renantormen.application.core.domain.Endereco;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EnderecoEntity extends Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private Integer id;

}
