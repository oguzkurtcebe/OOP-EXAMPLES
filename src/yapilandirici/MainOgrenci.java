package yapilandirici;

public class MainOgrenci {

    public static void main(String[] args) {
        Ogrenci ogr = new Ogrenci("Oğuz", 27, "Bilgisayar Mühendisliği:", 122546);
        System.out.println("isim:"+ogr.getIsim());
        System.out.println("Yaş:"+ogr.getYas());
        System.out.println("Bölümü:"+ogr.getBolumu());
        System.out.println("Numarası:"+ogr.getOkulno());
        System.out.println("**********");
        System.out.println("Öğrenci Bilgileri");
        System.out.println(ogr.getOgrenciBilgileri());

    }

}
