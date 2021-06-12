package TP2.app;

public class EpasseTurista {
private duracao Duracao;

    public EpasseTurista(duracao duracao) {
        Duracao = duracao;
    }
    public EpasseTurista( EpasseTurista outro){
        Duracao = outro.Duracao;
    }

    public duracao getDuracao() {
        return Duracao;
    }
}
