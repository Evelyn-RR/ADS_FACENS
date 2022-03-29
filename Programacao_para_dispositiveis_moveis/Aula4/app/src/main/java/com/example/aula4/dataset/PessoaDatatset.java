package com.example.aula4.dataset;

import com.example.aula4.models.Pessoa;

import java.util.ArrayList;

public class PessoaDatatset {
    private static ArrayList<Pessoa> pessoas;

    public static ArrayList<Pessoa> getItens(){
        pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(1, "Rafael Moreno", "222222"));
        pessoas.add(new Pessoa(2, "José da Silva", "3333333"));
        pessoas.add(new Pessoa(3, "Patricia Soares", "4444444"));
        pessoas.add(new Pessoa(4, "Rafael Moreno", "222222"));
        pessoas.add(new Pessoa(5, "José da Silva", "3333333"));
        pessoas.add(new Pessoa(6, "Patricia Soares", "4444444"));
        pessoas.add(new Pessoa(7, "Rafael Moreno", "222222"));
        pessoas.add(new Pessoa(8, "José da Silva", "3333333"));
        pessoas.add(new Pessoa(9, "Patricia Soares", "4444444"));

        return pessoas;
    }

    public static void addPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

}
