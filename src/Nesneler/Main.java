package Nesneler;

public class Main {

    public static void main(String[] args) {
        NesneOrnekleri ornek = new NesneOrnekleri(5, 6);
        NesneOrnekleri ornek2 = new NesneOrnekleri(2, 7);
        System.out.println("Ornek Nesnesi İçin En:" + ornek.en);
        System.out.println("Ornek Nesnesi İçin Boy:" + ornek.boy);
        System.out.println("Ornek2 Nesnesi İçin En:" + ornek2.en);
        System.out.println("Ornek2 Nesnesi İçin Boy:" + ornek2.boy);
    }

}
