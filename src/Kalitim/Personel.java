package Kalitim;

public class Personel {

    private String isim;
    private String soyisim;
    private int yasi;
 

    public Personel() {
    }

    public Personel(String isim, String soyisim, int yasi) {
        this.isim = isim;
        this.soyisim = soyisim;
        //   this.yasi = yasi;
        setYasi(yasi);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYasi() {
        return yasi;
    }

    public void setYasi(int yasi) {
        if (yasi < 0) {
            this.yasi = 0;
        } else {
            this.yasi = yasi;
        }

    }

    public String getKimlikBilgileri() {
        return "KimlikBilgileri; ismi:" + isim + " Soyismi:" + soyisim + " Yaşı:" + yasi;
    }

    @Override
    public String toString() {
        return "KimkikBilgileri:" + isim + " " + soyisim + " " + yasi;
    }

}
