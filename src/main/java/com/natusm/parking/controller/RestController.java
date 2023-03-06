package com.natusm.parking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
    @GetMapping
    public String teste(){
        return "Primeiro controller";
    }


    @GetMapping
    public String entrar(){
        return "Entrando carro";
    }

    @GetMapping
    public String sair(){
        return "Comando para sair Carro";
    }

    @GetMapping
    public String error(){
        return "Deu Erro";
    }
}
