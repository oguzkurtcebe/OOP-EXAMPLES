package Kapsülleme;
public class MainOgrenci {
    public static void main(String[] args) {
        Ogrenci ogr=new Ogrenci();
        ogr.setDate(1);
        ogr.setName("a");
        System.out.println("İsim:"+ogr.getName());
        System.out.println("Yaş:"+ogr.getDate());
    }
}
