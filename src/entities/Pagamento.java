package entities;

import enums.TipoPagamento;

import java.time.LocalDateTime;

public class Pagamento {
    private Integer id;
    private LocalDateTime dataHorario;
    private TipoPagamento tipoPagamento;
    private Double valor;
    private Pedido pedido;

    public Pagamento(){
        dataHorario = LocalDateTime.now();
    }
    public Pagamento(Integer id,TipoPagamento tipoPagamento,Pedido pedido){
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.valor = valor;
        this.pedido = pedido;
        dataHorario = LocalDateTime.now();
        this.valor = pedido.total();
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
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
        if (valor <= 0.0){
            throw new IllegalArgumentException("Valor Invalido, menor ou igual a zero!");
        }
        this.valor = valor;
    }

    public Pedido getPedido(){
        return pedido;
    }

}
