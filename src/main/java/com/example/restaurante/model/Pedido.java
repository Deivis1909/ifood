package com.example.restaurante.model;


import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    // relacionamento das tabelas no banco pedido @ManyToOne cliente
    // muitos pedidos para um cliente
    @ManyToOne
    private Cliente cliente;

    // muitos pedidos para um restaurante
    @ManyToOne
    private Restaurante restaurant;

    //lista de itens de pedido


    // LISTA PARA O BANCO SEMPRE É MANY
    // um pedido para muitos uma lista de  itens pedido
    //mappedBy sempre usar em listas pra dizer de onde elas veem
    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> itensPedido;


}
