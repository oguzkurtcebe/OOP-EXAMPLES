package GenericsSiniflar3;

import java.util.ArrayList;

public class OgretmenIslemleri implements Islemler<Ogretmen> {

    ArrayList<Ogretmen> liste = new ArrayList<>();

    @Override
    public boolean kaydet(Ogretmen t) {
        boolean durum = liste.add(t);
        return durum;
    }

    @Override
    public boolean sil(Ogretmen t) {
        boolean durum = liste.remove(t);
        return durum;
    }

    @Override
    public void listele() {
        for (Ogretmen x : liste) {
            System.out.print(x);
        }
        System.out.println();
    }
}


