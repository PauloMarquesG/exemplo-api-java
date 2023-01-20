package br.com.github.exemploapijava.data;

import br.com.github.exemploapijava.response.FuncionarioResponse;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class FuncionarioData {

    List<FuncionarioResponse> data;

}
