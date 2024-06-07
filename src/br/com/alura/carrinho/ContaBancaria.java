package br.com.alura.carrinho;

public class ContaBancaria {
    private double limiteDeCredito;

    boolean avaliarCompra(double valor) {
        return valor < limiteDeCredito;
    }

    void debitarValorDeCompra(double valor) {
        if (valor < limiteDeCredito) {
            limiteDeCredito -= valor;
        }
    }

    public double getLimiteDeCredito() {
        return limiteDeCredito;
    }

    public void setLimiteDeCredito(double limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }
}
