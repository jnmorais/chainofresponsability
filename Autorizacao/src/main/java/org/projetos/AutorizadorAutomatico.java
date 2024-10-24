package org.projetos;

public class AutorizadorAutomatico extends Autorizador {
    public AutorizadorAutomatico(Autorizador superior) {
        this.limiteMaximo = 1000.0; // Transações até R$ 1.000
        setAutorizadorSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Autorização Automática";
    }
}

