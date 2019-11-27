package Kalitim;

public class Hayvan {

    private String isim;
    private String cinsiyet;
    private int ayak_sayisi;
    private String ses;

    public Hayvan() {
        isim = "Henüz girilmedi";
        cinsiyet = "Henüz girilmedi";
        ses = "Henüz girilmedi";
        setAyak_sayisi(ayak_sayisi);
    }

    public Hayvan(String isim, String cinsiyet, int ayak_sayisi, String ses) {
        this.isim = isim;
        this.cinsiyet = cinsiyet;
        setAyak_sayisi(ayak_sayisi);
        this.ses = ses;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public int getAyak_sayisi() {
        return ayak_sayisi;
    }

    public void setAyak_sayisi(int ayak_sayisi) {
      if (ayak_sayisi < 2) {
            System.out.println("Ayak sayısı 2 den küçük olamaz");
            this.ayak_sayisi=ayak_sayisi;

        } else {
            this.ayak_sayisi = ayak_sayisi;
        }
    }

    public String getSes() {
        return ses;
    }

    public void setSes(String ses) {
        this.ses = ses;
    }

    public String getBilgiler() {
       return "Bilgiler;ismi "+isim+" cinsiyeti:"+cinsiyet+" Ayak Sayısı:"+ayak_sayisi+" Sesi:"+ses;
    }
}
