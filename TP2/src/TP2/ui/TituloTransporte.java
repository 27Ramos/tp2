package TP2.ui;

import TP2.app.EpassStandard;

public interface TituloTransporte {
    void carregar(double valorA);
    void pagarViagem(double valorA);
    boolean checkValidade();
    boolean passarSaldo(EpassStandard valorX, double valorA);
}

