package br.com.github.exemploapijava.service;

import br.com.github.exemploapijava.request.FuncionarioRequest;
import br.com.github.exemploapijava.response.FuncionarioResponse;

import java.util.List;

public interface FuncionarioService {

    List<FuncionarioResponse> getFuncionarios();

    List<FuncionarioResponse> insertFuncionario(FuncionarioRequest funcionarioRequest);

    List<FuncionarioResponse> updateFuncionario(FuncionarioRequest funcionarioRequest);

    void deleteFuncionario(Long id);
}
