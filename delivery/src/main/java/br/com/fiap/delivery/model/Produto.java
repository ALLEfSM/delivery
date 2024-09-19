package br.com.fiap.delivery.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter@Setter
@Entity
@Table(name = "Tb_Produto")
public class Produto {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private Double preco;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Produto produto;
}
