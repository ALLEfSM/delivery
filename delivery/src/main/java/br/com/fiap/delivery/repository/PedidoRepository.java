package br.com.fiap.delivery.repository;

import br.com.fiap.delivery.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
