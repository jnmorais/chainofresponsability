package org.projetos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TransacaoTest {
    AutorizadorSeguranca autorizadorSeguranca;
    AutorizadorGerente autorizadorGerente;
    AutorizadorAutomatico autorizadorAutomatico;

    @BeforeEach
    void setUp() {
        autorizadorSeguranca = new AutorizadorSeguranca(null);
        autorizadorGerente = new AutorizadorGerente(autorizadorSeguranca);
        autorizadorAutomatico = new AutorizadorAutomatico(autorizadorGerente);
    }

    @Test
    void deveRetornarAutorizacaoAutomaticaParaTransacaoPequena() {
        Transacao transacao = new Transacao(TipoTransacaoPequena.getTipoTransacaoPequena(), 500.0);
        assertEquals("Autorização Automática",
                autorizadorAutomatico.autorizarTransacao(transacao));
    }

    @Test
    void deveRetornarAutorizacaoGerenteParaTransacaoMedia() {
        Transacao transacao = new Transacao(TipoTransacaoMedia.getTipoTransacaoMedia(), 3000.0);
        assertEquals("Autorização Manual - Gerente",
                autorizadorAutomatico.autorizarTransacao(transacao));
    }

    @Test
    void deveRetornarAutorizacaoSegurancaParaTransacaoGrande() {
        Transacao transacao = new Transacao(TipoTransacaoGrande.getTipoTransacaoGrande(), 15000.0);
        assertEquals("Autorização de Alta Segurança",
                autorizadorAutomatico.autorizarTransacao(transacao));
    }

    @Test
    void deveRetornarTransacaoNaoAutorizadaParaValorMuitoAlto() {
        Transacao transacao = new Transacao(TipoTransacaoGrande.getTipoTransacaoGrande(), 60000.0);
        assertEquals("Transação não autorizada",
                autorizadorAutomatico.autorizarTransacao(transacao));
    }

    @Test
    void deveRetornarProximoNivelParaTransacaoPequenaComValorAlto() {
        Transacao transacao = new Transacao(TipoTransacaoPequena.getTipoTransacaoPequena(), 2000.0);
        assertEquals("Autorização Manual - Gerente",
                autorizadorAutomatico.autorizarTransacao(transacao));
    }

    @Test
    void deveRetornarProximoNivelParaTransacaoMediaComValorAlto() {
        Transacao transacao = new Transacao(TipoTransacaoMedia.getTipoTransacaoMedia(), 8000.0);
        assertEquals("Autorização de Alta Segurança",
                autorizadorAutomatico.autorizarTransacao(transacao));
    }
}