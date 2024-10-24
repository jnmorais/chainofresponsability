package org.projetos;

public class AutorizadorSeguranca extends Autorizador {
    public AutorizadorSeguranca(Autorizador superior) {
        this.limiteMaximo = 50000.0;
        setAutorizadorSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Autorização de Alta Segurança";
    }
}
