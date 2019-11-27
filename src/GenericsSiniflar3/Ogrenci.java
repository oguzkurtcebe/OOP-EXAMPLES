package GenericsSiniflar3;

import GenericsSiniflar.*;

public class Ogrenci extends Kisi{
  private String okulNumarasi;

    public Ogrenci() {
    }

    public Ogrenci(String okulNumarasi, String isim, String soyIsim, int dogumYili) {
        super(isim, soyIsim, dogumYili);
        this.okulNumarasi = okulNumarasi;
    }

    public String getOkulNumarasi() {
        return okulNumarasi;
    }

    public void setOkulNumarasi(String okulNumarasi) {
        this.okulNumarasi = okulNumarasi;
    }

    @Override
    public String toString() {
        return super.toString()+" Okul Numarasi="+okulNumarasi; 
    }

  

  
  
}
