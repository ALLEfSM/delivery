package br.com.fiap.delivery.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Entity
@Getter@Setter
@Table(name = "TB_Cliente")
public class Cliente {

    @Id
    @GeneratedValue
    @Column(name="id_cliente")
    private Long id;

    @Column(name="nome_cliente")
    private String nome;

    @OneToMany(mappedBy = "id_cliente", cascade = CascadeType.REMOVE)
    private List<Pedido> pedidos;

}
