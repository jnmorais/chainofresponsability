package org.projetos;

import java.util.ArrayList;

public abstract class Autorizador {
    protected ArrayList<TipoTransacao> listaTransacoes = new ArrayList<>();
    private Autorizador autorizadorSuperior;
    protected double limiteMaximo;

    public Autorizador getAutorizadorSuperior() {
        return autorizadorSuperior;
    }

    public void setAutorizadorSuperior(Autorizador autorizadorSuperior) {
        this.autorizadorSuperior = autorizadorSuperior;
    }

    public abstract String getDescricaoNivel();

    public String autorizarTransacao(Transacao transacao) {

        if (transacao.getValor() <= limiteMaximo) {
            return getDescricaoNivel();
        } else {
            if (autorizadorSuperior != null) {
                return autorizadorSuperior.autorizarTransacao(transacao);
            } else {
                return "Transação não autorizada";
            }
        }
    }
}
