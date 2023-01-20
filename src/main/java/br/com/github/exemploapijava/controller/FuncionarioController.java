package br.com.github.exemploapijava.controller;

import br.com.github.exemploapijava.data.FuncionarioData;
import br.com.github.exemploapijava.model.Funcionario;
import br.com.github.exemploapijava.request.FuncionarioRequest;
import br.com.github.exemploapijava.service.FuncionarioService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    @GetMapping(value = "/funcionarios", produces = {"application/json"})
    public ResponseEntity<FuncionarioData> getFuncionarios(){
        return ResponseEntity.status(HttpStatus.OK).body(FuncionarioData.builder().data(this.service.getFuncionarios()).build());
    }

    @PostMapping(value = "/funcionario/insert/", produces = {"application/json"})
    public ResponseEntity<FuncionarioData> insertFuncionario(@RequestBody FuncionarioRequest funcionarioRequest){
        return ResponseEntity.status(HttpStatus.OK).body(FuncionarioData.builder().data(this.service.insertFuncionario(funcionarioRequest)).build());
    }

    @PutMapping(value = "/funcionario/update/", produces = {"application/json"})
    public ResponseEntity<FuncionarioData> updateFuncionario(@RequestBody FuncionarioRequest funcionarioRequest){
        return ResponseEntity.status(HttpStatus.OK).body(FuncionarioData.builder().data(this.service.updateFuncionario(funcionarioRequest)).build());
    }

    @DeleteMapping(value = "/funcionario/delete/{id}", produces = {"application/json"})
    public ResponseEntity<Boolean> deleteFuncionario(@PathVariable Long id){
        this.service.deleteFuncionario(id);
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }

}
