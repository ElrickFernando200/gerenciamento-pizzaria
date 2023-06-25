package entities;

import exceptions.DataException;

import java.time.LocalDate;

public class Ingrediente {
    private Integer id;
    private String nome;
    private LocalDate validade;
    private Integer estoque;


    public Ingrediente(){}
    public Ingrediente(Integer id, String nome, LocalDate validade,Integer estoque){
        if (validade.isBefore(LocalDate.now())){
            throw new DataException("Data Invalida, anterior a data atual");
        }

        this.id = id;
        this.nome = nome;
        this.validade = validade;
        this.estoque = estoque;
    }

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
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
        if (validade.isBefore(LocalDate.now())){
            throw new DataException("Validade precisar ser datas futuras!");
        }
        this.validade = validade;
    }

    public Integer getEstoque(){
        return estoque;
    }

    public void addEstoque(int quantidade){
        if (quantidade <= 0){
            throw new IllegalArgumentException("Valor Invalido! Insira um valor maior que 0.");
        }
        estoque += quantidade;
    }
    public void removerEstoque(int quantidade){
        if (quantidade > estoque){
            throw new IllegalArgumentException("Estoque insuficiente!");
        } else if (quantidade <= 0){
            throw new IllegalArgumentException("Valor Invalido! Insira um valor maior que 0.");
        }
        estoque -= quantidade;
    }

}
