package org.jonathan;

import org.jonathan.frete.EstrategiaFrete;

public class ProcessadorDePagamento {
    public void processar(Pedido pedido, EstrategiaFrete estrategiaFrete) {
        pedido.setValorFinal(estrategiaFrete.calcularValorFinal(pedido));
        System.out.println("|| =================================================");
        System.out.println("|| Valor do Pedido: R$" + pedido.getValorBruto());
        System.out.println("|| Valor do Frete: R$" + pedido.getValorFrete());
        System.out.println("|| Valor Final com Frete: R$" + pedido.getValorFinal());
        System.out.println("|| =================================================");
    }
}

