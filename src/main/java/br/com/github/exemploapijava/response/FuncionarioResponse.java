package br.com.github.exemploapijava.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Date;


@Getter
@Setter
public class FuncionarioResponse {

    private Long id;
    private String nome;
    private String cargo;
    private BigDecimal salario;
    private String status;

}
