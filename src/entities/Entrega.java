package entities;

import java.time.LocalDateTime;

public class Entrega {

    private Integer id;
    private LocalDateTime data;
    private String endereco;
    private Entregador entregador;
    private Pedido pedido;

    public Entrega(){}

    public Entrega(Integer id,LocalDateTime data,String endereco, Entregador entregador,Pedido pedido){
        this.id = id;
        this.data = data;
        this.endereco = endereco;
        this.entregador = entregador;
        this.pedido = pedido;
    }


    public Integer getId(){
        return id;
    }

    public LocalDateTime getData(){
        return data;
    }

    public void setData(LocalDateTime data){
        this.data = data;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public Entregador getEntregador(){
        return entregador;
    }

    public void setEntregador(Entregador entregador){
        this.entregador = entregador;
    }

    public Pedido getPedido(){
        return pedido;
    }

    public void setPedido(Pedido pedido){
        this.pedido = pedido;
    }

}
