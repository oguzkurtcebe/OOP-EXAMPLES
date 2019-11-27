package GenericsSiniflar3;

import java.util.ArrayList;

public class OgrenciIslemleri implements Islemler<Ogrenci> {

    ArrayList<Ogrenci> liste = new ArrayList<>();

    @Override
    public boolean kaydet(Ogrenci t) {
        boolean durum = liste.add(t);
        return durum;

    }

    @Override
    public boolean sil(Ogrenci t) {
        boolean durum = liste.remove(t);
        return durum;
    }

    @Override
    public void listele() {
        for (Ogrenci x : liste) {
            System.out.print(x);
        }
        System.out.println();
    }

}
