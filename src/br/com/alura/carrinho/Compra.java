package br.com.alura.carrinho;

public class Compra implements Comparable<Compra>{
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public int compareTo(Compra o) {
        return (int)(this.valor - o.getValor());
    }

    @Override
    public String toString() {
        return "%s - %.2f".formatted(descricao, valor);
    }
}
