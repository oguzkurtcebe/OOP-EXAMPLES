package GenericsMetodlar2;

public class Kare extends Sekiller {

    private double kenar;

    public Kare() {
        kenar = 0;
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
    public double alanBul() {
        return kenar*kenar;
    }

   

}
