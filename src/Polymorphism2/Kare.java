package Polymorphism2;

public class Kare extends Sekiller {

    private double kenar;

    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        this.kenar = kenar;
    }

    public Kare(double kenar) {
        this.kenar = kenar;
    }

    @Override
    public double alanHesapla() {
        return Math.pow(kenar, 2);
    }

}
