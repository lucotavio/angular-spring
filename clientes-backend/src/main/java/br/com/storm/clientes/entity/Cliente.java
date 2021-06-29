package br.com.storm.clientes.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.luciano.bean.validationCpf.CPF;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "CLIENTE")
public class Cliente {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "{campo.nome.obrigatorio}")
    @Column(name = "NOME", nullable = false, length = 150)
    private String nome;

    @CPF(message = "{campo.cpf.invalido}")
    @Column(name = "CPF", nullable = false, length = 14)
    private String cpf;

    @JsonFormat(pattern="dd/MM/yyyy")
    @Column(name = "DATA_CADASTRO")
    private LocalDate dataCadastro;
}
