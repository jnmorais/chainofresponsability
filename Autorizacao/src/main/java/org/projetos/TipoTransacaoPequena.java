package org.projetos;

public class TipoTransacaoPequena implements TipoTransacao {
    private static TipoTransacaoPequena tipoTransacaoPequena = new TipoTransacaoPequena();

    private TipoTransacaoPequena() {};

    public static TipoTransacaoPequena getTipoTransacaoPequena() {
        return tipoTransacaoPequena;
    }
}
