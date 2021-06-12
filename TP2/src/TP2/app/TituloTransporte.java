package TP2.app;

public interface TituloTransporte {
    public double carregar(double valor);
    public double pagarViagem(double saldo);
    public boolean checkValidade();
    public boolean passarSaldo(Epass Pass,double valor);



}
