package istisnalar;

public class FinallyBlok2 {

    public static void main(String[] args) {
        int[] dizi = new int[3];
        dizi[0] = 1;
        dizi[1] = 2;
        dizi[2] = 3;
        try {
            System.out.println(dizi[0]);
            System.out.println(dizi[1]);
            System.out.println(dizi[2]);
            System.out.println(dizi[3]);
        } catch (NullPointerException istisna) {
            System.out.println("Neden dizinin Olmayan Elemanına erişmek istiyorsunuz");
        }
    finally{
            System.out.println("Ben burdayım çalışıyorum");
        }
        System.out.println("Main metod sonu");
    }

}
