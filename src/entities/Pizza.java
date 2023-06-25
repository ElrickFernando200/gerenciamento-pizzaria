package entities;

import enums.PizzaTamanho;
import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private Integer id;
    private String sabor;
    private Double preco;
    private PizzaTamanho tamanho;
    private List<Ingrediente> ingredientes = new ArrayList<>();

    public Pizza(){}
    public Pizza(Integer id, String sabor,Double preco, PizzaTamanho tamanho){
        if (preco <= 0.0){
            throw new IllegalArgumentException("Valor Invalido, Menor ou igual a zero!");
        }
        this.id = id;
        this.sabor = sabor;
        this.preco = preco;
        this.tamanho = tamanho;
    }

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }


    public String getSabor(){
        return sabor;
    }

    public void setSabor(String sabor){
        this.sabor = sabor;
    }
    public Double getPreco(){
        return preco;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public PizzaTamanho getTamanho(){
        return tamanho;
    }

    public void setTamanho(PizzaTamanho tamanho){
        this.tamanho = tamanho;
    }
    public List<Ingrediente> getIngredientes(){
        return ingredientes;
    }

    public void addIngrediente(Ingrediente ingrediente){
        if (ingrediente == null){
            throw new IllegalArgumentException("Valor inserido Invalido, (null)");
        }
        ingredientes.add(ingrediente);
    }

    public void removeIngrediente(Ingrediente ingrediente){
        if (ingrediente == null){
            throw new IllegalArgumentException("Valor Inserido Invalido, (null)");
        }else if (!ingredientes.contains(ingrediente)){
            throw new IllegalArgumentException("Valor Inserido não existe na lista de ingredientes! ");
        }
        ingredientes.remove(ingrediente);
    }
}
