package Kapsülleme;

public class MainDikdortgen {

    public static void main(String[] args) {
        Dikdortgen dd1 = new Dikdortgen();
        dd1.setEn(4);
        dd1.setBoy(13);

        System.out.println("En:" + dd1.getEn());
        System.out.println("Boy:" + dd1.getBoy());
        System.out.println("Dikdörtgenin Alanı:" + dd1.DikdortgeninAlani());

    }

}
