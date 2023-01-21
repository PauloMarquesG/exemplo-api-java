package br.com.github.exemploapijava.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "Funcionario")
public class Funcionario {

    @Id
    @Column(name = "id_funcionario")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome_funcionario")
    private String nome;

    @Column(name = "cargo_funcionario")
    private String cargo;

    @Column(name = "salario_funcionario")
    private BigDecimal salario;

    @Column(name = "status_funcionario")
    private String status;

}
