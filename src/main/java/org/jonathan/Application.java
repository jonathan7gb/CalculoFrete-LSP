package org.jonathan;

import org.jonathan.frete.FreteGratis;
import org.jonathan.frete.FretePadrao;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProcessadorDePagamento processadorDePagamento = new ProcessadorDePagamento();

        System.out.print("""
                || ==== PEDIDO ==== ||
                || VALOR DO PEDIDO: R$  """);
        double valor = sc.nextDouble();

        if(valor <= 0){
            throw new IllegalArgumentException("|| O valor do pedido não pode ser 0 ou negativa!");
        }

        System.out.print("""
                \n|| ==== TIPO DO FRETE ==== ||
                || 1 - GRÁTIS
                || 2 - PADRÃO
                || ======================= ||
                || SUA ESCOLHA: """);
        int escolha = sc.nextInt();

        if(escolha != 1 && escolha != 2){
            throw new IllegalArgumentException("|| Escolha inválida");
        }

        Pedido pedido = new Pedido();
        switch (escolha){
            case 1 -> {
                pedido.setValorBruto(valor);
                FreteGratis freteGratis = new FreteGratis();
                processadorDePagamento.processar(pedido, freteGratis);
            }
            case 2 -> {
                System.out.print("\n|| VALOR DO FRETE: R$: ");
                double valorFrete = sc.nextDouble();

                if(valorFrete <= 0 ){
                    throw new IllegalArgumentException("\n|| Valor do Frete deve ser maior que 0!");
                }

                pedido.setValorBruto(valor);
                pedido.setValorFrete(valorFrete);
                FretePadrao fretePadrao = new FretePadrao();
                processadorDePagamento.processar(pedido, fretePadrao);
            }
        }
    }
}