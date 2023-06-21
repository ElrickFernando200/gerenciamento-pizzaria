package entities;

public class ItemPedido {

    private Integer id;
    private Double preco;
    private Integer quantidade;
    private Pizza pizza;


    public ItemPedido(){}

    public ItemPedido(Integer id,Integer quantidade, Pizza pizza){
        this.id = id;
        this.preco = pizza.getPreco();
        this.quantidade = quantidade;
        this.pizza = pizza;
    }

    public Integer getId(){
        return id;
    }

    public Double getPreco(){
        return preco;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public Integer getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(Integer quantidade){
        this.quantidade = quantidade;
    }

    public Pizza getPizza(){
        return pizza;
    }
    public void setPizza(Pizza pizza){
        this.pizza = pizza;
    }

    public Double subTotal(){
        return quantidade * preco;
    }

    @Override
    public String toString(){
        return  "------------- \n"
                +
                "id: "
                + id +"\n"
                + " quantidade: "
                + quantidade + "\n"
                + "Pizza" + "\n"
                + pizza.getSabor()+"\n"
                + " preço unidade R$: "
                + preco
                + " \n Sub total: "
                + subTotal() + "\n";
    }
}
