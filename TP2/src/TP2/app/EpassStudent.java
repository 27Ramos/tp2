package TP2.app;


import java.time.LocalDate;

public class EpassStudent extends EpassStandard implements TituloTransporte {
    private int ano;
    private String escola;
    private int viagemFree;
    private int anoFrequenta;
    //private ArrayList<Zona> zonas;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }


    public EpassStudent(double saldo,double precoViagem, LocalDate carregamento, LocalDate validade, int ano, String escola) {
        super(saldo,precoViagem,carregamento,validade);
        this.ano = ano;
        this.escola = escola;
    }


    @Override
    public double carregar(double valor) {
        if(valor > 0){
            double newSaldo =this.saldo + valor;
            this.saldo=newSaldo;
            this.carregamento = LocalDate.now();
            return newSaldo;
        }
        return 0;
    }



    @Override
    public double pagarViagem(double saldo) {
        if(saldo<20){
            System.out.println("Nao pode realizar viagem.");
            return 0;
        }
        else{
            double newSaldo;
            newSaldo= this.saldo - 20;
            return newSaldo ;
        }

    }

    @Override
    public boolean checkValidade() {
        return false;
    }

    @Override
    public boolean passarSaldo(Epass outroPasse, double valor) {
        if (this.saldo < valor) {
            System.out.println("Transferencia Impossivel");
            return false;
        } else {
            this.saldo = this.saldo - valor;
            outroPasse.saldo = outroPasse.saldo + valor;

            return true;


        }
    }
}
