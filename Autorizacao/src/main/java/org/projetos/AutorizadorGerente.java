package org.projetos;

public class AutorizadorGerente extends Autorizador {
    public AutorizadorGerente(Autorizador superior) {
        this.limiteMaximo = 5000.0;
        setAutorizadorSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Autorização Manual - Gerente";
    }
}