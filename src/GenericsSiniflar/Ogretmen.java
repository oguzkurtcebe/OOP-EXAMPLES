package GenericsSiniflar;
public class Ogretmen extends Kisi{
    private String brans;

    public Ogretmen() {
    }

    public Ogretmen(String brans, String isim, String soyIsim, int dogumYili) {
        super(isim, soyIsim, dogumYili);
        this.brans = brans;
    }

    public Ogretmen(String isim, String soyIsim, int dogumYili) {
        super(isim, soyIsim, dogumYili);
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return super.toString()+" brans="+brans;
    }


  

    

   

   
}
