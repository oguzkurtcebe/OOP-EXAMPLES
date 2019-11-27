package Polymorphism3;

public class MainCalisan {
    public static void main(String[] args) {
            calisanlarinMaaslari(new Yonetici("Yönetici", 300));
            calisanlarinMaaslari(new Isci("İşçi",200));
            calisanlarinMaaslari(new Memur("Memur", 100));
    }
public static void calisanlarinMaaslari(Calisan calisan){
    System.out.println(calisan.getStatu()+"'nin maaşı:"+calisan.maasHesapla());
}
}

class Calisan {

    private String statu;
    private double katsayi;

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu;
    }

    public double getKatsayi() {
        return katsayi;
    }

    public void setKatsayi(double katsayi) {
        this.katsayi = katsayi;
    }

    public Calisan(String statu, double katsayi) {
        this.statu = statu;
        this.katsayi = katsayi;
    }

    public double maasHesapla() {
        return 30 * katsayi;
    }
}

class Yonetici extends Calisan {

    public Yonetici(String statu, double katsayi) {
        super(statu, katsayi);
    }

    @Override
    public double maasHesapla() {
        return 30 * getKatsayi();
    }
}

class Memur extends Calisan {

    public Memur(String statu, double katsayi) {
        super(statu, katsayi);
    }

    @Override
    public double maasHesapla() {
        return 30 * getKatsayi();
    }
}

class Isci extends Calisan {

    public Isci(String statu, double katsayi) {
        super(statu, katsayi);
    }

    @Override
    public double maasHesapla() {
        return 30 * getKatsayi();
    }

}
