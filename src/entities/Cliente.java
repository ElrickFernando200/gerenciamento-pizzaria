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
        pedidos.add(pedido);
    }
    public  void removePedido(Pedido pedido){
        pedidos.remove(pedido);
    }

    public void addPagamento(Pagamento pagamento){
        pagamentos.remove(pagamento);
    }

}
