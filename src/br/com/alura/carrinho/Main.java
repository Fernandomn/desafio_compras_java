package br.com.alura.carrinho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 1;
        ContaBancaria conta = new ContaBancaria();
        List<Compra> carrinhoDeCompras = new ArrayList<>();

        System.out.println("Digite o limite do cartão: ");
        conta.setLimiteDeCredito(scanner.nextDouble());

        while (opcao != 0) {
            System.out.println("Digite a descrição da compra: ");
            String descricao = scanner.next();

            System.out.println("Digite o valor da compra: ");
            double valor = scanner.nextDouble();

            if (conta.avaliarCompra(valor)) {
                conta.debitarValorDeCompra(valor);
                carrinhoDeCompras.add(new Compra(descricao, valor));

                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                opcao = scanner.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                opcao = 0;
            }
        }

        Collections.sort(carrinhoDeCompras);
        System.out.println("********************");
        System.out.println("COMPRAS REALIZADAS: ");
        System.out.println();
        for (Compra compra : carrinhoDeCompras) {
            System.out.println(compra);
        }
        System.out.println();
        System.out.println("********************");
        System.out.println();
        System.out.println("Saldo do cartão: %.2f".formatted(conta.getLimiteDeCredito()));
    }
}
