package Abstract2;

public class Dikdortgen extends Sekiller {

    private double en;
    private double boy;

    public Dikdortgen() {
    }

    public Dikdortgen(double en, double boy) {
        this.en = en;
        this.boy = boy;
    }

    public double getEn() {
        return en;
    }

    public void setEn(double en) {
        this.en = en;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    @Override
    public double alanHesapla() {
        return en * boy;
    }

    @Override
    public double cevreHesapla() {
        return (2 * en) + (2 * boy);
    }

}
