package istisnalar;

public class MainPersonel {

    public static void main(String[] args) {
        try {
            Personel personel = new Personel(35);
            System.out.println("Personelin yaşı:" + personel.getYas());

            Personel personel2 = new Personel(-35);
            System.out.println("Personelin yaşı:" + personel2.getYas());

            Personel personel3 = new Personel(45);
            System.out.println("Personelin yaşı:" + personel3.getYas());

        } catch (IllegalArgumentException istisna) {
           System.out.println("Hata:"+istisna.getMessage());
            System.out.println(istisna);
        }

    }

}
