package entities;

import enums.StatusPedido;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Integer id;
    private LocalDateTime data;
    private StatusPedido statusPedido;
    private List<ItemPedido> itensPedidos = new ArrayList<>();
    private Cliente cliente;
    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");



    public Pedido(Integer id, StatusPedido statusPedido,Cliente cliente){
        this.id = id;
        this.statusPedido = statusPedido;
        this.cliente = cliente;
        data = LocalDateTime.now();
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id ){
        this.id = id;
    }
    public LocalDateTime getData(){
        return data;
    }

    public StatusPedido getStatusPedido(){
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido){
        this.statusPedido = statusPedido;
    }

    public List<ItemPedido> getItensPedidos(){
        return itensPedidos;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void addItem(ItemPedido itemPedido) {
        if (itemPedido == null){
            throw new IllegalArgumentException("Valor não pode ser nulo");
        }
        itensPedidos.add(itemPedido);
    }

    public void removerItem(ItemPedido itemPedido){
        if (itemPedido == null){
            throw new IllegalArgumentException("Valor não pode ser nulo");
        } else if (!itensPedidos.contains(itemPedido)){
            throw new IllegalArgumentException("Valor Inserido Invalido, ItemPedido não contém na Lista.");
        }
        itensPedidos.remove(itemPedido);
    }

    public Double total(){
        double soma = 0.0;
        for (ItemPedido it: itensPedidos){
            soma += it.subTotal();
        }
        return soma;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Código pedido: " + id);
        sb.append(" Data: " + dateTimeFormatter.format(data) + "\n");
        sb.append(" Status pedido: " + statusPedido.toString() + "\n");
        for (ItemPedido item: itensPedidos){
            System.out.println(item);
        }
        sb.append("Cliente: " + cliente.getNome() + "\n");
        sb.append("Valor Total " + total());
        return sb.toString();
    }
}
