package org.jonathan.frete;

import org.jonathan.Pedido;

public class FreteGratis implements EstrategiaFrete{

    @Override
    public double calcularValorFinal(Pedido pedido){
        return pedido.getValorBruto();
    }
}
