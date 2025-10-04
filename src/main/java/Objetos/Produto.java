/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author andrey.munhoz
 */
public class Produto {
    private String Nome;
    private String Descricao;
    private int Quantidade;
    private Double Preco;

    
   public Produto(String Nome, String Descricao, int Quantidade, Double Preco){
       setNome(Nome);
       setDescricao(Descricao);
       setQuantidade(Quantidade);
       setPreco(Preco);
   }
    

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public Double getPreco() {
        return Preco;
    }

    public void setPreco(Double Preco) {
        this.Preco = Preco;
    }

}
