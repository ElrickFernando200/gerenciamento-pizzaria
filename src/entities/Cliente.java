package entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente  extends Usuario{
    private List<Pedido> pedidos = new ArrayList<>();
    private List<Pagamento> pagamentos = new ArrayList<>();

    public Cliente(){}

    public Cliente(Integer id,String nome, String email, String cpf, String telefone){
        super(id, nome, email, cpf, telefone);
    }

    public List<Pedido> getPedidos(){
        return pedidos;
    }

    public List<Pagamento> getPagamentos(){
        return pagamentos;
    }

    public  void addPedido(Pedido pedido){
        if (pedido == null){
            throw  new IllegalArgumentException("O valor não pode ser nulo! ");
        }
        pedidos.add(pedido);
    }
    public  void removePedido(Pedido pedido){
        if (pedido == null){
            throw  new IllegalArgumentException("O valor não pode ser nulo! ");
        } else if(!pedidos.contains(pedido)){
            throw new IllegalArgumentException("Pedido não existe dentro da lista");
        }
        pedidos.remove(pedido);
    }

    public void addPagamento(Pagamento pagamento){
        if (pagamento == null){
            throw  new IllegalArgumentException("O valor não pode ser nulo! ");
        }
        pagamentos.add(pagamento);
    }
    public void removePagamento(Pagamento pagamento){
        if (pagamento == null){
            throw  new IllegalArgumentException("O valor não pode ser nulo!");
        } else if (!pagamentos.contains(pagamento)){
            throw new IllegalArgumentException("Não contém esse pagamento dentro da lista!");
        }
        pagamentos.remove(pagamento);
    }

}
