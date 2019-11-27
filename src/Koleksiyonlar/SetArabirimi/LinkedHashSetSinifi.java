package Koleksiyonlar.SetArabirimi;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetSinifi {

    public static void main(String[] args) {
        String dizi[] = {"Ali", "Veli", "Deli", "Ayşe", "Nuriye", "Duriye","Duriye"};
        LinkedHashSet<String> kume = new LinkedHashSet<>();
        System.out.println("Geliştirilmiş for döngüsü kullanıldığında");
        for (String x : dizi) {
            boolean ekle = kume.add(x);
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("İterator metodunu kullandığımızda");
        Iterator<String>iterator=kume.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }

}
