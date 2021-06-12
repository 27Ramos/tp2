package TP2.app;

import java.time.LocalDate;

public class Titular {
    private  DocumentoID docID;
    private  String nome;
    private  LocalDate ddn;
    private  String morada;
    private String email;
    private  int telef;

    public Titular(String codigoDoc, TipoDocumento tipoDoc, String nome, LocalDate ddn, int telef,String email){
        this.docID = new DocumentoID(codigoDoc, tipoDoc);
        this.nome = nome;
        this.ddn = ddn;
        this.telef = telef;


    }

    public Titular(DocumentoID docID, LocalDate ddn, String nome, String email) {
        this.docID = docID;
        this.ddn = ddn;
        this.nome = nome;
        this.email = email;

    }

    public Titular(DocumentoID docID, String nome, LocalDate ddn, String morada, String email, int telef) {


    }
}
