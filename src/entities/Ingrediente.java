package entities;

import java.time.LocalDate;

public class Ingrediente {
    private Integer id;
    private String nome;
    private LocalDate validade;
    private Integer estoque;


    public Ingrediente(){}
    public Ingrediente(Integer id, String nome, LocalDate validade,Integer estoque){
        this.id = id;
        this.nome = nome;
        this.validade = validade;
        this.estoque = estoque;
    }

    public Integer getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public LocalDate getValidade(){
        return validade;
    }

    public void setValidade(LocalDate validade){
        this.validade = validade;
    }

    public Integer getEstoque(){
        return estoque;
    }

    public void addEstoque(int quantidade){
        estoque += quantidade;
    }
    public void removerEstoque(int quantidade){
        estoque -= quantidade;
    }

}
