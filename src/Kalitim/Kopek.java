package Kalitim;
public class Kopek extends Hayvan{
public String mama;

   

    public Kopek(String mama, String isim, String cinsiyet, int ayak_sayisi, String ses) {
        super(isim, cinsiyet, ayak_sayisi, ses);
        this.mama = mama;
    }

    @Override
    public String getBilgiler() {
        return super.getBilgiler()+" Mama:"+mama;
    }

   

    
    

 


   
    
}
