package com.example.exemplo1.controllers;

import com.example.exemplo1.Development;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Development
public class MinhaConfiguracao {
    /*@Profile("development")
    @Bean (name = "nomeAplicacao")
    public String nomeAplicacao(){
        return "Aula 2 - Teste";
    }
    @Bean (name = "versaoAplicacao")
    public String versaoAplicacao(){
        return "1.0.0";
    }*/

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("Executou meu método!!!");
        };
    }
}
