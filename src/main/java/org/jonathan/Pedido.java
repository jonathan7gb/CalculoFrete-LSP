package org.jonathan;

public class Pedido {

    protected double valorBruto;
    protected double valorFinal;
    protected double valorFrete = 0.0;

    public Pedido(double valorBruto) {
        this.valorBruto = valorBruto;
        this.valorFinal = valorBruto;
    }

    public Pedido(){
        this.valorBruto = 0;
        this.valorFinal = 0;
        this.valorFrete = 0;
    }

    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }
}
