package GenericsSiniflar3;

public class Test {

    public static void main(String[] args) {

        Ogrenci ogrenci = new Ogrenci("232435", "Emir  ", "Kurtcebe", 2007);
        Ogretmen ogretmen = new Ogretmen("Fizik", "Emrullah", "Alış", 1974);

        System.out.println("Öğrenci Bilgileri:");
        
        OgrenciIslemleri ogrenciIslemleri = new OgrenciIslemleri();
        OgretmenIslemleri ogretmenIslemleri = new OgretmenIslemleri();

        ogrenciIslemleri.kaydet(ogrenci);
        ogrenciIslemleri.listele();
        
        System.out.println("Öğretmen Bilgileri:");
        
        ogretmenIslemleri.kaydet(ogretmen);
        ogretmenIslemleri.listele();
    }

}
