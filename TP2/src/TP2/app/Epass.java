package TP2.app;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Epass {

    private long codigo;
    protected double saldo;
    private double precoViagem;
    public final LocalDateTime emissao;
    protected LocalDate carregamento;
    private  LocalDate validade;
    private  static long ultCodigo;

    static {
        if(Long.valueOf(ultCodigo)==null)
            ultCodigo = 0;

    }
    public Epass(){
        this.codigo = ultCodigo +1;
        this.emissao = LocalDateTime.now();
        ultCodigo++;
    }

    public Epass(double precoViagem, LocalDate carregamento, LocalDate validade, double saldo) {
        this.precoViagem=precoViagem;
        this.carregamento=LocalDate.now();
        this.validade = LocalDate.now();
        this.saldo=saldo;
        this.emissao=LocalDateTime.now();
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getPrecoViagem() {
        return precoViagem;
    }

    public void setPrecoViagem(double precoViagem) {
        this.precoViagem = precoViagem;
    }

    public LocalDateTime getEmissao() {
        return emissao;
    }

    public LocalDate getCarregamento() {
        return carregamento;
    }

    public void setCarregamento(LocalDate carregamento) {
        this.carregamento = carregamento;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public static long getUltCodigo() {
        return ultCodigo;
    }

    public static void setUltCodigo(long ultCodigo) {
        Epass.ultCodigo = ultCodigo;
    }

    public Epass(double saldo, double precoViagem){
        this.codigo = ultCodigo+1;
        ultCodigo++;
        this.saldo = saldo;
        this.precoViagem = precoViagem;
        this.emissao = LocalDateTime.now();


    }
    public Epass(double precoViagem, LocalDate carregamento, LocalDate validade, double saldo, LocalDateTime emissao){
        this.saldo = saldo;
        this.emissao = emissao;
        this.carregamento = LocalDate.now();
        this.validade = LocalDate.now();
        this.precoViagem = precoViagem;
    }
    public Epass(double precoViagem, LocalDateTime emissao){
        this.precoViagem= precoViagem;
        this.emissao = emissao;
    }


    }

