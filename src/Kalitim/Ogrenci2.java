package Kalitim;

public class Ogrenci2 extends Personel {

    private int ogrenciNo = 0;

    public Ogrenci2() {
        super();
        ogrenciNo = 0;
    }

    public Ogrenci2(String isim, String soyisim, int yasi, int ogrenciNo) {
        super(isim, soyisim, yasi);
        setOgrenciNo(ogrenciNo);
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        if (ogrenciNo < 0) {
            this.ogrenciNo=0;
        } else {
            this.ogrenciNo = ogrenciNo;
        }

    }

    @Override
    public String getKimlikBilgileri() {
        return super.getKimlikBilgileri()+" Öğrenci No "+ogrenciNo;
    }

}
