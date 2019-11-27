package Abstract2;
public class Kare extends Sekiller{
private double kenar;

    public Kare() {
    }



    public Kare(double kenar) {
        this.kenar = kenar;
    }

    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        this.kenar = kenar;
    }

    @Override
    public double alanHesapla() {
        return kenar*kenar;
    }

    @Override
    public double cevreHesapla() {
       return 4*kenar; 
    }

    
}
