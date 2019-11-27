package StaticAlan;

public class Main {

    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci("Oğuz", "Kurtcebe", 1992, " 12260546");
        Ogrenci ogrenci1 = new Ogrenci("Ahmet ", "Tokgöz", 1993, "12260530");
        Ogrenci.setOkul("Fırat Üniversitesi:");
        
        System.out.println("Oğrenci1 bilgi:");
        System.out.println("İsim:" + ogrenci.getIsim() + " Soyisim:" + ogrenci.getSoyisim() + " Doğum tarihi:" + ogrenci.getDogumyili()
                + " okul numarası:" + ogrenci.getOkulno() + " Okulu:" + Ogrenci.getOkul());
        System.out.println("Oğrenci2 bilgi:");
        System.out.println("İsim:" + ogrenci1.getIsim() + " Soyisim:" + ogrenci1.getSoyisim() + " Doğum tarihi:" + ogrenci1.getDogumyili()
                + " okul numarası:" + ogrenci1.getOkulno() + " Okulu:" + Ogrenci.getOkul());
   
    
    
    }


}
