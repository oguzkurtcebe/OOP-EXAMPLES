package GenericsSiniflar;

public class Test {

    public static void main(String[] args) {
        Ogretmen ogretmen = new Ogretmen("Fizik:", "Emrullah", "Alış:", 1975);
        Ogrenci ogrenci = new Ogrenci("6536363", "Emir", "Kurtcebe", 2007);
        Islemler<Ogretmen> ogretmenIslem = new Islemler<Ogretmen>();
        Islemler<Ogrenci>ogrenciIslem=new Islemler<Ogrenci>();

        System.out.println("Öğretmen İşlem");
        ogretmenIslem.kaydet(ogretmen);
        ogretmenIslem.listele();
        System.out.println("Öğrenci İşlem");
        ogrenciIslem.kaydet(ogrenci);
        ogrenciIslem.listele();
    }

}
