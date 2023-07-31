package com.example.restaurante.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
public class Restaurante {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;


    // lista do objeto produtos
    // list é tipo um array so que dinamico

    @OneToMany(mappedBy = "restaurant")
    private List<Produto> produtos;


    //lista do obejto pedidos
    @OneToMany(mappedBy = "restaurant")
    private List<Pedido> pedidos;



}
