package Koleksiyonlar.ListArabirimi;

import java.util.Enumeration;
import java.util.Vector;

public class VektorSinifi {

    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add(2, "Gercek 3.eleman benim");
        System.out.println("İlk eleman:" + list.firstElement());
        System.out.println("Son eleman:" + list.lastElement());
        System.out.println("Vektorun uzunlugu:"+list.size());
        System.out.println("Vektorun elemanları:"+list);
        Enumeration enumeration=list.elements();
        System.out.println("Enumeration kullanılırsa:");
        while(enumeration.hasMoreElements()){
            System.out.print(enumeration.nextElement()+" ");
        }

    }

}
