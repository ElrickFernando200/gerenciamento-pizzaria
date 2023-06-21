package entities;

import java.util.ArrayList;
import java.util.List;

public class Entregador extends Usuario {
    private Boolean ativo;
    private List<Entrega> entregas = new ArrayList<>();


    public Entregador(Integer id, String nome,String email, String cpf, String telefone, Boolean ativo){
        super(id, nome, email, cpf, telefone);
        this.ativo = ativo;
    }
    public Boolean getAtivo(){
        return ativo;
    }

    public void setAtivo(Boolean ativo){
        this.ativo = ativo;
    }

    public List<Entrega> geEntregas(){
        return entregas;
    }

    public void addEntrega(Entrega entrega){
        entregas.add(entrega);
    }


}
