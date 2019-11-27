package Kalitim;

public class Yonetici extends Calisan {

    private int kisi_sayisi;

    public Yonetici() {
    }

    public Yonetici(String name, String department, int salary, int kisi_sayisi) {
        super(name, department, salary);
        this.kisi_sayisi = kisi_sayisi;

    }

    public void zam_durumu(int miktar){
        System.out.println("Çalışanlara "+miktar+" tl kadar zam yapıldı..");
    }

    @Override
    public void bilgiler() {
        super.bilgiler();
        System.out.println("Sorumlu Kişi Sayısı:"+kisi_sayisi);
    }
}
