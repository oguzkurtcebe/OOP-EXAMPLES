package Kalitim;

public class Ogrenci extends Personel {

    private int ogrenciNo = 0;

    public Ogrenci() {
        setIsim("henüz girilmedi");
        setSoyisim("henüz girilmedi");
        setYasi(0);

    }

    public Ogrenci(String isim, String soyisim, int yasi, int ogrenciNo) {
        setIsim(isim);
        setSoyisim(soyisim);
        setYasi(yasi);
        setOgrenciNo(ogrenciNo);
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        if (ogrenciNo < 0) {
            ogrenciNo = 0;
        } else {
            this.ogrenciNo = ogrenciNo;
        }

    }

    /*  @Override
    public String getKimlikBilgileri() {
        return "KimlikBilgileri;ismi:"+isim+" Soyismi:"+soyisim+" Yasi:"+yasi+" ogenciNo:"+ogrenciNo;
    }*/
    @Override
    public String getKimlikBilgileri() {
        return "KimlikBilgileri;ismi:" + getIsim() + " Soyismi:" + getSoyisim() + " Yaşı:" + getYasi() + " OgrenciNo:" + ogrenciNo;
    }

}
