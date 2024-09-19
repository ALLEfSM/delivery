package br.com.fiap.delivery.repository;

import br.com.fiap.delivery.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
