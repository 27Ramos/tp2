package TP2.app;

import java.time.LocalDate;

public abstract class EpassStandard extends Epass {
    private Titular titular;
    private int pontos;
    private int numeroViagens;
    private String chave;

    public EpassStandard(String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn,String nome,String email,int telef){
        super();
        titular = new Titular(codigoDoc,tipoDoc,nome,ddn,telef,email);
        this.titular= titular;

    }
    public EpassStandard(DocumentoID docID,LocalDate ddn,String nome,String email){
        super();
        titular = new Titular(docID, ddn, nome, email);
       // this.chave =gerarChave
    }
    public EpassStandard(DocumentoID docID,String nome,LocalDate ddn,String morada,String email,int telef){
        super();
        titular = new Titular(docID,nome,ddn,morada,email,telef);

    }


    public EpassStandard(double saldo, double precoViagem, LocalDate carregamento, LocalDate validade) {
        super(precoViagem,carregamento,validade,saldo);

    }


    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public int getPontos() {
        return pontos;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }
   // public pagarViagemCompontos(int pontoViagem){
        //this.pontoViagem = pontoViagem;
    }


