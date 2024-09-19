package br.com.fiap.delivery.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_Cliente_Pedido")
@Getter@Setter
public class ClientePedido {

    @Id
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @Id
    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;
}
