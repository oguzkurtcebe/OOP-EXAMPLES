package erisimbelirleyiciler;

public class Main {

    public static void main(String[] args) {
        Dikdortgen dd1 = new Dikdortgen();
        Dikdortgen dd2 = new Dikdortgen();
 
//        dd1.en = 8;
//        dd1.boy = 6;
//        dd2.en = 7;
//        dd2.boy = 8;

        System.out.println("Dikdörtgen1 Alanı:" + dd1.DikdortgeninAlani());
        System.out.println("Dikdörtgen2 Alanı:" + dd2.DikdortgeninAlani());
        System.out.println(dd1.pi);

    }
}
