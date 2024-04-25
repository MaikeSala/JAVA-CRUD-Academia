package br.com.sennatech.desafio.repository;

import br.com.sennatech.desafio.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
