package org.projetos;

public class TipoTransacaoGrande implements TipoTransacao {
    private static TipoTransacaoGrande tipoTransacaoGrande = new TipoTransacaoGrande();

    private TipoTransacaoGrande() {};

    public static TipoTransacaoGrande getTipoTransacaoGrande() {
        return tipoTransacaoGrande;
    }
}
