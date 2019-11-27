package GenericsSiniflar;
public  class Kisi {
private String isim;
private String soyIsim;    
private int dogumYili;    

    public Kisi() {
    }

    public Kisi(String isim, String soyIsim, int dogumYili) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.dogumYili = dogumYili;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
    }

    @Override
    public String toString() {
        return "Kisi:" + "isim=" + isim + ", soyIsim=" + soyIsim + ", dogumYili=" + dogumYili ;
    }




    
    
   }

