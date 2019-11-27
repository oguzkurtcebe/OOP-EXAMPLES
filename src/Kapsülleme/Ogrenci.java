package Kapsülleme;

public class Ogrenci {

    private String isim;
    private int dogumTarihi;

    public Ogrenci() {

    }

    public String getName() {
        return isim;
    }

    public void setName(String i) {
        if (i.length() < 2) {
            System.out.println("isim Alanı boş olamaz");
        } else {
            isim = i;
        }
    }

    public int getDate() {
        return dogumTarihi;
    }
public void setDate(int d){
  if(d<1){
      System.out.println("doğru düzgün bir sayı gir uleeeennn!!1");
  }
  else{
      dogumTarihi=d;
  }       

}


}
