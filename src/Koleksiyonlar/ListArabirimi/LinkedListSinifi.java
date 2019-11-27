package Koleksiyonlar.ListArabirimi;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListSinifi {

    public static void main(String[] args) {
        LinkedList<String> liste = new LinkedList<>();

        liste.add("1");
        liste.add("2");
        liste.add("3");
        liste.add("4");
        liste.add("5");
        liste.add(3, "33");
        System.out.println("Birinci eleman:" + liste.getFirst());
        System.out.println("Son eleman:" + liste.getLast());
        System.out.println("İlk elemanı kaldır:" + liste.removeFirst());
        System.out.println("Son elemanı kaldır:" + liste.removeLast());
        System.out.println("İlk eleman :" + liste.getFirst());
        System.out.println("Son eleman :" + liste.getLast());
        System.out.println("İterator nesnesi kullanılırsa baştan sona doğru");
        Iterator<String> listIterator=liste.listIterator();
       
        while(listIterator.hasNext()){
            System.out.print(listIterator.next()+" ");
        }
         listIterator=liste.listIterator(liste.size());
        System.out.println();
        System.out.println("İterator nesnesi kullanırsa sondan başa doğru");
    
       
    
    }

}
