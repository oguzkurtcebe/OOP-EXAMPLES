package Kapsülleme;
import java.util.Scanner;
public class ArabaMain {

    public static void main(String[] args)
    {
        Araba arb = new Araba();
        Scanner k = new Scanner(System.in);
        System.out.println("Araç Özelliklerini Giriniz:");

        System.out.print("Marka:");
        String marka = k.nextLine();
        System.out.print("Model:");
        String model = k.nextLine();

        System.out.print("Beygir:");
        int beygir = k.nextInt();

        System.out.print("KapiSayisi:");
        int KapiSayisi = k.nextInt();

        arb.setMarka(marka);
        arb.setModel(model);
        arb.setBeygir(beygir);
        arb.setKapi_Sayisi(KapiSayisi);

        System.out.println("Marka:" + arb.getMarka());
        System.out.println("Model:" + arb.getModel());
        System.out.println("Beygir:" + arb.getBeygir());
        System.out.println("Kapı Sayısı:" + arb.getKapi_Sayisi());

    }
}
