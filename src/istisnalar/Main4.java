package istisnalar;

public class Main4{

    public static void main(String[] args) {
        int dizi[] = new int[3];
        dizi[0] = 1;
        dizi[1] = 2;
        dizi[2] = 3;
        istisna1(dizi);
        System.out.println("main metod sonu..Sıra BENDE");

    }

    public static void istisna1(int[] dizi) {
     
        try {
           istisna2(dizi); 
        } catch (Exception e) {
            System.out.println("Hata itisna1de yakalandı");
        }
        System.out.println("istisna1 ...SIRA BENDE");
    }

    public static void istisna2(int[] dizi1) {
        System.out.println("İstisna2...SIRA BENDE");
        try {
            System.out.println("Sayı1:" + dizi1[0]);
            System.out.println("Sayı2:" + dizi1[1]);
            System.out.println("Sayı3:" + dizi1[2]);
            System.out.println("Sayı4:" + dizi1[3]);
            System.out.println("Bu satır Çalışacak mı??");
        } catch (Exception e) {
            System.out.println("Hata istisna 2 metodubnda yakalandı");

        }
        System.out.println("Ne oldu Çalıştı mı");
    }
}
