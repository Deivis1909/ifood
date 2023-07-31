package com.example.restaurante.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
//onde aparece quantidade e produto
public class ItemPedido {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // para quantidade produto guia tudo

    private int quantidade;


    // muitos item pedido para um pedido
    @ManyToOne
    private Pedido pedido;

    //muitos itens produto para um produto
    @ManyToOne
    private Produto produto;


}
