package application;

import entities.*;
import enums.PizzaTamanho;
import enums.StatusPedido;
import enums.TipoPagamento;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GerenciamentoPizzaria {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1,"Elrick Fernando","elrick@gmail.com","1896811","81996171251");
        Entregador entregador = new Entregador(5,"Junior","junior@gmail.com","846161165","81466551",true);

        DateTimeFormatter formatted = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Ingrediente ingrediente1 = new Ingrediente(1,"massa", LocalDate.parse("21/06/2023",formatted),150);
        Ingrediente ingrediente2 = new Ingrediente(1,"tomate", LocalDate.parse("25/07/2023",formatted),80);
        Ingrediente ingrediente3 = new Ingrediente(1,"cebola", LocalDate.parse("22/07/2023",formatted),85);
        Ingrediente ingrediente4 = new Ingrediente(1,"oregano", LocalDate.parse("20/08/2023",formatted),36);


        Pizza pizza1 = new Pizza(1,"Frango",36.0, PizzaTamanho.GRANDE);
        Pizza pizza2 = new Pizza(2,"Calabresa",27.0, PizzaTamanho.GRANDE);
        Pizza pizza3 = new Pizza(3,"Mussarela",25.0, PizzaTamanho.GRANDE);
        Pizza pizza4 = new Pizza(4,"Costela",55.0, PizzaTamanho.GRANDE);

        pizza1.addIngrediente(ingrediente1);
        pizza1.addIngrediente(ingrediente2);
        pizza1.addIngrediente(ingrediente3);
        pizza1.addIngrediente(ingrediente4);


        ItemPedido itemPedido = new ItemPedido(1,1, pizza1);
        ItemPedido itemPedido1 = new ItemPedido(2,1, pizza2);
        ItemPedido itemPedido2 = new ItemPedido(3,1, pizza3);
        ItemPedido itemPedido3 = new ItemPedido(4,1, pizza4);

        Pedido pedido = new Pedido(891361, StatusPedido.AGUARDANDO_PAGAMENTO,cliente);
        pedido.addItem(itemPedido);
        pedido.addItem(itemPedido1);
        pedido.addItem(itemPedido2);
        pedido.addItem(itemPedido3);

        Pagamento pagamento = new Pagamento(1, TipoPagamento.PIX,cliente,pedido);
        pedido.setStatusPedido(StatusPedido.PEDIDO_EM_ANDAMENTO);
        pedido.setPagamento(pagamento);

        cliente.addPagamento(pagamento);

        Entrega entrega = new Entrega(1, LocalDateTime.now(),"Rua 38  4 etapa",entregador,pedido);
        entregador.addEntrega(entrega);


        System.out.println(pedido);




    }
}
