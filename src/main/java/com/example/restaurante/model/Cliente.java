package com.example.restaurante.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;


//ORM mapeamento objeto relacional
@Entity
public class Cliente {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    private String contato;

    private String endereco;

}
