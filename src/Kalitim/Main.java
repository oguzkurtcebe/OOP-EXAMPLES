package Kalitim;
public class Main {
    public static void main(String[] args) {
        Personel person=new Personel("Senior", "developer",33);
        System.out.println(person.getKimlikBilgileri());
        System.out.println(person.toString());
        System.out.println("**********");
        
        Ogrenci ogrenci=new Ogrenci("Junior", "developer", 23, 6533);
        
        System.out.println(ogrenci.getKimlikBilgileri());
        System.out.println(ogrenci.toString());
          
    }
}
