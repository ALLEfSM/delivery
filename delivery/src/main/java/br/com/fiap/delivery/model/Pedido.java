package br.com.fiap.delivery.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter@Setter
@Table(name="TB_Pedido")
@EntityListeners(AuditingEntityListener.class)
public class Pedido {

    @Id
    @Column(name="id_pedido")
    @GeneratedValue
    private Long id;


    @Column(name="data")
    @CreatedDate
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "id_cliente")

    private Cliente cliente;

    @OneToMany(mappedBy = "id_pedido", cascade = CascadeType.REMOVE)
    private List<Produto> produtos;
}
