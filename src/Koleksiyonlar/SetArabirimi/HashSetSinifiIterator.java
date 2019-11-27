package Koleksiyonlar.SetArabirimi;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSinifiIterator {
    public static void main(String[] args) {
        String dizi[]={"Ali","Veli","Deli","Ayşe","Nuriye","Duriye"};
        HashSet<String>kume=new HashSet<String>();
        for(String s:dizi){
            boolean ekle=kume.add(s);
        }
        System.out.println("İterator modu kullandığımızda ");
        
        Iterator<String>iterator=kume.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    
    }
    
}
