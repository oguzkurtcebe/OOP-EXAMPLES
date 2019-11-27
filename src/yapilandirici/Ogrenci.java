package yapilandirici;

public class Ogrenci {

    private String isim;
    private int yas;
    private String bolumu;
    private int okulno;

    public Ogrenci() {
        System.out.println("Burası default yapılandırıcı");
    }

    public Ogrenci(String isim, int yas, String bolumu, int okulno) {
       this();
        this.isim = isim;
        this.yas = yas;
        this.bolumu = bolumu;
        this.okulno = okulno;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getBolumu() {
        return bolumu;
    }

    public void setBolumu(String bolumu) {
        this.bolumu = bolumu;
    }

    public int getOkulno() {
        return okulno;
    }

    public void setOkulno(int okulno) {
        this.okulno = okulno;
    }

    public String getOgrenciBilgileri() {
        return "ogrencibilgileri;ismi:" + isim + " Yasi:" + yas + " bolumu:" + bolumu + " okulno:" + okulno;
    }

}
