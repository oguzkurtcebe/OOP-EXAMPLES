package Kalitim;

public class Kedi extends Hayvan {

    private String biyik ;

    public String getBiyik() {
        return biyik;
    }

    public void setBiyik(String biyik) {
        this.biyik = biyik;
    }

    public Kedi() {
    }

    public Kedi(String biyik) {
        this.biyik = biyik;
    }

    public Kedi(String biyik, String isim, String cinsiyet, int ayak_sayisi, String ses) {
        super(isim, cinsiyet, ayak_sayisi, ses);
        this.biyik = biyik;
    }

    

  

    

    @Override
    public String getBilgiler() {
        return super.getBilgiler()+" Bıyık:"+biyik; 
    }

}
