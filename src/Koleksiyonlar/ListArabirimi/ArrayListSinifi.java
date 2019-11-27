package Koleksiyonlar.ListArabirimi;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSinifi {

    public static void main(String[] args) {
        String[] isimDizisi = {"Ali", "Veli", "Deli", "Ayşe", "Fatma", "Duriye", "Nuriye", "Deli"};
        String[] soyisimDizisi = {"Aliye", "Veli", "Deliye", "Ayşegül", "Nuriye"};

        ArrayList<String> isimListesi = new ArrayList<>();
        ArrayList<String> soyisimListesi = new ArrayList<>();

        for (String x : isimDizisi) {
            isimListesi.add(x);
        }

        for (String x : soyisimDizisi) {
            soyisimListesi.add(x);
        }
        Iterator iterator = isimListesi.listIterator();
        while (iterator.hasNext()) {
            if (soyisimListesi.contains(iterator.next())) {
                iterator.remove();
            }

        }
        System.out.println("dizinin son hali");
        for (String x:isimListesi       ) {
            System.out.print(x+" ");
        }
    }

}
