package entities;

import java.time.LocalDateTime;

public class Entrega {

    private Integer id;
    private LocalDateTime data;
    private String endereco;
    private Entregador entregador;
    private Pedido pedido;


    public Entrega(){}

    public Entrega(Integer id,String endereco, Entregador entregador,Pedido pedido){
        if (endereco == null || entregador == null || pedido == null){
            throw new IllegalArgumentException("Valor não pode ser nulo!");
        }
        this.id = id;
        this.endereco = endereco;
        this.entregador = entregador;
        this.pedido = pedido;
        data = LocalDateTime.now();
    }


    public Integer getId(){
        return id;
    }

    public LocalDateTime getData(){
        return data;
    }

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        if (endereco == null){
            throw new IllegalArgumentException("Valor não pode ser nulo!");
        }
        this.endereco = endereco;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public void setEntregador(Entregador entregador){
        if (entregador == null){
            throw new IllegalArgumentException("Valor não pode ser nulo!");
        }
        this.entregador = entregador;
    }

    public Pedido getPedido(){
        return pedido;
    }

}
