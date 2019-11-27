package metotlaranesneatama;

public class MainDikdortgen {

    public static void main(String[] args) {
        Dikdortgen dd1 = new Dikdortgen(6, 5);
        System.out.println("dd1 dikdörtgeninin ilk alanı:" + dd1.DikdortgeninAlani());
        System.out.println();
        System.out.println("Metod tarafından dikdörtgene verilen yeni değere göre");
        yeniDikdortgen(dd1);

        System.out.println("Dikdörtgenin yeni Alanı:" + dd1.DikdortgeninAlani());
        System.out.println("");

        System.out.println("Dikdörtgenin yeni eni:" + dd1.getEn());
        System.out.println("Dikdörtgenin yeni boyu:" + dd1.getBoy());

        System.out.println("en son alan:" + dd1.DikdortgeninAlani());
        
        Dikdortgen dd2=Sonuc();
        
        System.out.println("dd2 Sonuc:"+dd2.DikdortgeninAlani());
        
    }

    public static void yeniDikdortgen(Dikdortgen dd1) {
        dd1.setBoy(15);
        dd1.setEn(15);
    }

    public static Dikdortgen Sonuc() {
         Dikdortgen dd1 = new Dikdortgen(8,9);
        return dd1;
    }
}
