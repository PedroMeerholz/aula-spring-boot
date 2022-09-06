package io.github.pedromeerholz.controlefrota.controller;

import io.github.pedromeerholz.controlefrota.model.Funcionario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class ControllerFuncionario {
    private List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();

    @PostMapping("/adicionar")
    @ResponseStatus(HttpStatus.CREATED)
    public String cadastrarFuncionario(@RequestBody Funcionario funcionario) {
        this.listaFuncionario.add(funcionario);
        return "Funcionário criado com sucesso";
    }

    @GetMapping("/consultar")
    public ResponseEntity<List<Funcionario>> consultarFuncionarios() {
        return new ResponseEntity<>(this.listaFuncionario, HttpStatus.OK);
    }

    @GetMapping("/consultar/{codigo}")
    public ResponseEntity<Funcionario> consultarFuncionario(@PathVariable("codigo") long codigo) {
        Funcionario funcionario = this.listaFuncionario.stream().filter(a -> a.getCodigo() == codigo).findFirst().get();
        return new ResponseEntity<>(funcionario, HttpStatus.OK);
    }

    @PutMapping("/alterar/{codigo}")
    public ResponseEntity<Funcionario> alterarFuncionario(@PathVariable("codigo") long codigo, @RequestBody Funcionario funcionario) {
        this.listaFuncionario.stream().filter(a -> a.getCodigo() == codigo).forEach(a -> {
            a.setNome(funcionario.getNome());
            a.setCpf(funcionario.getCpf());
            a.setDataNascimento(funcionario.getDataNascimento());
        });
        return new ResponseEntity<>(funcionario, HttpStatus.OK);
    }

    @PatchMapping("/alterar-nome/{codigo}")
    public String alterarAtributoFuncionario(@PathVariable("codigo") long codigo,
                                                                  @RequestBody Funcionario funcionario) {
        this.listaFuncionario.stream().filter(a -> a.getCodigo() == codigo).forEach(a -> {
            a.setNome(funcionario.getNome());
        });

        return "Nome atualizado com sucesso!";
    }
}
