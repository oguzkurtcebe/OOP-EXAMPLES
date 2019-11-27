package Koleksiyonlar.SetArabirimi;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSinifiIterator2 {
 public static void main(String[] args) {
           String dizi[] = {"Ali", "Veli", "Deli", "Ayşe", "Nuriye", "Duriye","Ali","Veli"};
           HashSet<String> kume = new HashSet<String>();

     System.out.println("Geliştirilmiş for döngüsü kullanıldığında ");
     for(String x:dizi){
               boolean ekle = kume.add(x);
               System.out.print(x+" ");
     }
     System.out.println();
 
     System.out.println("İterator kullanıldığında ");
     Iterator<String>iterator=kume.iterator();
     
     while(iterator.hasNext()){
         System.out.print(iterator.next()+" ");
     }
 
 }


}
