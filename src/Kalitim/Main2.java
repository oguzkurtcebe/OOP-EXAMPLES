package Kalitim;

public class Main2 {

    public static void main(String[] args) {
        Personel person = new Personel("Senior", "Developer", 33);
        System.out.println(person.getKimlikBilgileri());
        System.out.println(person.toString());
        
        System.out.println("*********");
        Ogrenci2 ogr = new Ogrenci2("junior", "Developer", 23, 6523);
        System.out.println(ogr.getKimlikBilgileri());
        System.out.println(ogr.toString());
      
    }
}
