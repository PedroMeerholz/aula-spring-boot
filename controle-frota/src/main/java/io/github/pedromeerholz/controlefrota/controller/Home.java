package io.github.pedromeerholz.controlefrota.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home") //Define o endpoint base da aplicação
public class Home {
    @GetMapping("/index") //Define o endpoint para acessar o método
    public String index() {
        return "Bem-vindo!";
    }
}
