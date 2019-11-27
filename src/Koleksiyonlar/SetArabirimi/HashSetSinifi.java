package Koleksiyonlar.SetArabirimi;

import com.sun.org.apache.xerces.internal.xs.StringList;
import java.util.HashSet;

public class HashSetSinifi {
    public static void main(String[] args) {
        String dizi[]={"Ali","Ayşe","Mehmet","Emir","Çağan"};
   
        HashSet<String>kume=new HashSet<>();
        boolean ekle = false;
        for(String x:dizi){
          ekle=kume.add(x);
            System.out.println(x+" ");
        }
        System.out.println("Koleksiyonun elemen Sayısı:"+kume.size());
    
        System.out.println("Sonuc:"+ekle);
    
    }
    
}
