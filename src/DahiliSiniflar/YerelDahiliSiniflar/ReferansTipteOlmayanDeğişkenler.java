package DahiliSiniflar.YerelDahiliSiniflar;

public class ReferansTipteOlmayanDeğişkenler {

    public static void main(String[] args) {
        final int x = 5;
        final int y = 15;
        final int toplam = x + y;

        class Toplama {

            void sonuc() {
                System.out.println(toplam);
            }
        }
        Toplama toplama = new Toplama();
        toplama.sonuc();

    }

}
