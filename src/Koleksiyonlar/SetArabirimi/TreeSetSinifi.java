package Koleksiyonlar.SetArabirimi;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSinifi {

    public static void main(String[] args) {
        String dizi[] = {"Ali", "Veli", "Deli", "Ayşe", "Nuriye", "Fatma", "Duriye", "Vela"};
        Integer dizi2[] = {4, 2, 7, 15, 1, 8, 3, 0, 98, 75, 6,6,6,6,6,6,6,15,4,2};
        TreeSet<String> kume = new TreeSet<>();
        TreeSet<Integer> kume2 = new TreeSet<>();

        for (String s : dizi) {
            boolean ekle = kume.add(s);
        }

        for (Integer x : dizi2) {
            boolean ekle2 = kume2.add(x);
        }

        Iterator<String> iterator = kume.iterator();
        Iterator<Integer> iterator2 = kume2.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Sayı sıralaması");
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }

    }

}
