package br.com.github.exemploapijava.mapper;

import br.com.github.exemploapijava.controller.model.Funcionario;
import br.com.github.exemploapijava.request.FuncionarioRequest;
import br.com.github.exemploapijava.response.FuncionarioResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FuncionarioMapper {

    List<FuncionarioResponse> toFuncionarioResponse(List<Funcionario> funcionarios);

    Funcionario toFuncionario(FuncionarioRequest funcionarioRequest);
}
