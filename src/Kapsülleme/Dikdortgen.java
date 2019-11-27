package Kapsülleme;

public class Dikdortgen {

    private int en;
    private int boy;

    public Dikdortgen() {

    }

    public void setEn(int x) {
        if (x <= 0) {
            System.out.println("En sıfırdan küçük eşit girilemez");
        } else {
            en = x;
        }

    }

    public int getEn() {
        return en;
    }

    public void setBoy(int y) {
        if (y <= 0) {
            System.out.println("Boy sıfırdan küçük eşit olamaz");
        }
        else{
            boy=y;
        }
    }

    public int getBoy() {
        return boy;
    }

    public int DikdortgeninAlani() {
        return en * boy;
    }

}
