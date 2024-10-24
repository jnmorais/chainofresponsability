package org.projetos;

public class TipoTransacaoMedia implements TipoTransacao {
    private static TipoTransacaoMedia tipoTransacaoMedia = new TipoTransacaoMedia();

    private TipoTransacaoMedia() {};

    public static TipoTransacaoMedia getTipoTransacaoMedia() {
        return tipoTransacaoMedia;
    }
}
