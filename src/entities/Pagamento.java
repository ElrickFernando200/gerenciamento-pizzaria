package entities;

import enums.TipoPagamento;

import java.time.LocalDateTime;

public class Pagamento {
    private Integer id;
    private LocalDateTime dataHorario;
    private TipoPagamento tipoPagamento;
    private Double valor;
    private Cliente cliente;
    private Pedido pedido;

    public Pagamento(){}
    public Pagamento(Integer id,TipoPagamento tipoPagamento, Cliente cliente, Pedido pedido){
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.valor = pedido.total();
        this.cliente = cliente;
        this.pedido = pedido;
        dataHorario = LocalDateTime.now();
    }

    public Integer getId(){
        return id;
    }

    public LocalDateTime getDataHorario(){
        return dataHorario;
    }

    public TipoPagamento getTipoPagamento(){
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento){
        this.tipoPagamento = tipoPagamento;
    }

    public Double getValor(){
        return valor;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }
    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public Pedido getPedido(){
        return pedido;
    }

    public void setPedido(Pedido pedido){
        this.pedido = pedido;
    }
}
