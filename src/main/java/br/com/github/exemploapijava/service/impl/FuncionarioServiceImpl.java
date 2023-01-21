package br.com.github.exemploapijava.service.impl;

import br.com.github.exemploapijava.mapper.FuncionarioMapper;
import br.com.github.exemploapijava.controller.model.Funcionario;
import br.com.github.exemploapijava.repository.FuncionarioRepository;
import br.com.github.exemploapijava.request.FuncionarioRequest;
import br.com.github.exemploapijava.response.FuncionarioResponse;
import br.com.github.exemploapijava.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    @Autowired
    private FuncionarioMapper mapper;

    @Override
    public List<FuncionarioResponse> getFuncionarios() {
        List<FuncionarioResponse> listReturn = new ArrayList<>();

        List<Funcionario> funcionarios = this.repository.findAll();
        listReturn = this.mapper.toFuncionarioResponse(funcionarios);
        return listReturn;
    }

    public List<FuncionarioResponse> getFuncionarioById(Long id) {
        List<FuncionarioResponse> listReturn = new ArrayList<>();

        List<Funcionario> funcionarios = this.repository.findAllById(Collections.singleton(id));
        listReturn = this.mapper.toFuncionarioResponse(funcionarios);

        return listReturn;
    }

    @Override
    public List<FuncionarioResponse> insertFuncionario(FuncionarioRequest funcionarioRequest) {
        Funcionario funcionario = this.mapper.toFuncionario(funcionarioRequest);
        this.repository.save(funcionario);
        List<FuncionarioResponse> listReturn = getFuncionarioById(funcionario.getId());
        return listReturn;
    }

    @Override
    public List<FuncionarioResponse> updateFuncionario(FuncionarioRequest funcionarioRequest) {
        Funcionario funcionario = this.mapper.toFuncionario(funcionarioRequest);
        this.repository.save(funcionario);
        List<FuncionarioResponse> listReturn = getFuncionarioById(funcionario.getId());
        return listReturn;
    }

    @Override
    public void deleteFuncionario(Long id) {
        this.repository.deleteById(id);
    }

}
