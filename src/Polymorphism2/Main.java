package Polymorphism2;

public class Main {

    public static void main(String[] args) {
        Sekiller[] sekilDizisi = new Sekiller[6];

        Kare kare = new Kare(7);
        Kare kare2 = new Kare(8);

        Dikdortgen dikdortgen = new Dikdortgen(4, 7);
        Dikdortgen dikdortgen2 = new Dikdortgen(5, 7);

        Daire daire = new Daire(2);
        Daire daire2 = new Daire(1);

        sekilDizisi[0] = kare;
        sekilDizisi[1] = kare2;
        sekilDizisi[2] = dikdortgen;
        sekilDizisi[3] = dikdortgen2;
        sekilDizisi[4] = daire;
        sekilDizisi[5] = daire2;

        SekillerinAlani(sekilDizisi);

    }

    public static void SekillerinAlani(Sekiller[] sekilDizisi) {
        for (Sekiller sekil : sekilDizisi) {
            System.out.println(sekil.alanHesapla());
        }
    }
}
