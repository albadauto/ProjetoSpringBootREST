package br.com.projeto.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.models.Pessoa;

@RestController
public class Controller {

    @GetMapping("/")
    public String Message(){
        return "Hello world";
    }

    @GetMapping("/boasVindas/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "Seja bem vindo(a) " + nome;
    }

    @PostMapping("/retornaPessoa")
    public Pessoa retornaPessoa(@RequestBody Pessoa p){
        return p;
    }
}
