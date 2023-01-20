package br.com.github.exemploapijava.request;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class FuncionarioRequest {

    private Long id;
    private String nome;
    private String cargo;
    private BigDecimal salario;
    private String status;

}
