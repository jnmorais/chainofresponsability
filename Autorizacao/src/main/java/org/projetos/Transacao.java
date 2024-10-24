package org.projetos;

public class Transacao {
    private TipoTransacao tipoTransacao;
    private double valor;

    public Transacao(TipoTransacao tipoTransacao, double valor) {
        this.tipoTransacao = tipoTransacao;
        this.valor = valor;
    }

    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public double getValor() {
        return valor;
    }
}
