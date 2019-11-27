package Polymorphism2;

public class Daire extends Sekiller {

    private double yaricap;

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    public Daire(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double alanHesapla() {
        return Math.PI*yaricap*yaricap;
    }

}
