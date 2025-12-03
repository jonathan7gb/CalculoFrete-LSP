package org.jonathan.frete;

import org.jonathan.Pedido;

public class FretePadrao implements EstrategiaFrete{

    @Override
    public double calcularValorFinal(Pedido pedido){
        return pedido.getValorBruto() + pedido.getValorFrete();
    }
}
