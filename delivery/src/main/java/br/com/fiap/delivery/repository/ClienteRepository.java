package br.com.fiap.delivery.repository;

import br.com.fiap.delivery.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {


}
