package com.example.restaurante.model;


import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String descricao;

    //1 produto varios itemPedido
    @OneToMany
    private List<ItemPedido> itens;

    private double preco;


    @ManyToOne
    private Restaurante restaurant;
    // CHAVE PARA RESTAURANT mn


}
