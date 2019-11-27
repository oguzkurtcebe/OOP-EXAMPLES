package StaticAlan;

import java.util.logging.Logger;

public class Ogrenci {
private String isim;
private String soyisim;
private int dogumyili;
private String okulno;
private static String okul;

    public Ogrenci() {
    }

    public Ogrenci(String isim, String soyisim, int dogumyili, String okulno) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumyili = dogumyili;
        this.okulno = okulno;
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

    public int getDogumyili() {
        return dogumyili;
    }

    public void setDogumyili(int dogumyili) {
        this.dogumyili = dogumyili;
    }

    public String getOkulno() {
        return okulno;
    }

    public void setOkulno(String okulno) {
        this.okulno = okulno;
    }

    public static String getOkul() {
        return okul;
    }

    public static void setOkul(String okul) {
        Ogrenci.okul = okul;
    }
  
}
