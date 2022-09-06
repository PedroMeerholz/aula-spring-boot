package io.github.pedromeerholz.controlefrota.controller;

import io.github.pedromeerholz.controlefrota.model.Veiculo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/veiculo")
public class ControllerVeiculo {
    private List<Veiculo> listaVeiculos = new ArrayList<Veiculo>();

    @PostMapping("/adicionar")
    @ResponseStatus(HttpStatus.CREATED)
    public String cadastrarVeiculo(@RequestBody Veiculo veiculo) {
        this.listaVeiculos.add(veiculo);
        return "Veículo cadastrado com sucesso!";
    }

    @GetMapping("/consultar")
    public List<Veiculo> consultarVeiculos() {
        return this.listaVeiculos;
    }

}
