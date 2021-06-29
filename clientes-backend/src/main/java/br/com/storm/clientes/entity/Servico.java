package br.com.storm.clientes.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "SERVICO")
public class Servico {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "DESCRICAO")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE")
    private Cliente cliente;
}
