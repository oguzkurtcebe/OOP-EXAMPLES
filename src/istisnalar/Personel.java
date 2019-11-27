package istisnalar;
public class Personel {
private int yas;

    public Personel() {
        yas=1;
    }
    
    public Personel(int yas) {
        setYas(yas);
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas)throws IllegalArgumentException {
        if(yas<0){
            IllegalArgumentException istisna=new IllegalArgumentException("Personel Yaşını Dikkatli Giriniz:");
            throw istisna;
        }
    
        else{
            this.yas=yas;
        }
    }

 

 
    }


