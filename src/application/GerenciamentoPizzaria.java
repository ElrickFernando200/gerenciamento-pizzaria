package application;

import entities.*;
import enums.PizzaTamanho;
import enums.StatusPedido;
import enums.TipoPagamento;
import exceptions.DataException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class GerenciamentoPizzaria {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            Cliente cliente = new Cliente(1, "Elrick Fernando", "elrick@gmail.com", "1896811", "81996171251");
            Entregador entregador = new Entregador(5, "Junior", "junior@gmail.com", "846161165", "81466551", true);

            Ingrediente ingrediente1 = new Ingrediente(1, "Massa", LocalDate.parse("24/05/2023",formatter), 50);
            Ingrediente ingrediente2 = new Ingrediente(2, "Molho de tomate", LocalDate.parse("29/06/2023",formatter),20);
            Ingrediente ingrediente3 = new Ingrediente(3, "Queijo", LocalDate.parse("26/08/2023", formatter), 60);
            Ingrediente ingrediente4 = new Ingrediente(3, "Azeitona", LocalDate.parse("30/12/2023", formatter), 30);
            Ingrediente ingrediente5 = new Ingrediente(3, "Oregano", LocalDate.parse("01/10/2023", formatter), 250);


            Pizza pizza1 = new Pizza(23, "Queijo", 30.0, PizzaTamanho.GRANDE);
            Pizza pizza2 = new Pizza(35, "Calabresa", 40.0, PizzaTamanho.GRANDE);
            pizza1.addIngrediente(ingrediente1);
            pizza1.addIngrediente(ingrediente2);
            pizza2.addIngrediente(ingrediente3);
            pizza2.addIngrediente(ingrediente4);

            ItemPedido itemPedido1 = new ItemPedido(1469848, 3, pizza1);
            ItemPedido itemPedido2 = new ItemPedido(1489849, 2, pizza2);


            Pedido pedido = new Pedido(16865, StatusPedido.PEDIDO_EM_ANDAMENTO, cliente);
            pedido.addItem(itemPedido1);
            pedido.addItem(itemPedido2);
            Pagamento pagamento = new Pagamento(161151, TipoPagamento.PIX,pedido);
            Entrega entrega = new Entrega(51651, "Rua 38", entregador,pedido);

            System.out.println(pedido);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch (DataException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
