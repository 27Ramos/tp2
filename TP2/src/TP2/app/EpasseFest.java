package TP2.app;

public class EpasseFest {
    private double saldoCartaoPgmnt;
    private String nomeEvento;

    public EpasseFest(double saldoCartaoPgmnt, String nomeEvento) {
        this.saldoCartaoPgmnt = saldoCartaoPgmnt;
        this.nomeEvento = nomeEvento;
    }

    public EpasseFest(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }
    public EpasseFest(EpasseFest outro){
        this.saldoCartaoPgmnt = outro.saldoCartaoPgmnt;
        this.nomeEvento = outro.nomeEvento;

    }

    public double getSaldoCartaoPgmnt() {
        return saldoCartaoPgmnt;
    }

    public void setSaldoCartaoPgmnt(double saldoCartaoPgmnt) {
        this.saldoCartaoPgmnt = saldoCartaoPgmnt;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }
}
