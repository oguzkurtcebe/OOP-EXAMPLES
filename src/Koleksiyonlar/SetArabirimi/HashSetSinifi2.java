package Koleksiyonlar.SetArabirimi;

import java.util.HashSet;

public class HashSetSinifi2 {
    public static void main(String[] args) {
        HashSet<String>Liste=new HashSet<>();
        String dizi[]={"Emir","Ali","Harun","Ayşe", "Fatma","Ali"};
        
        for(String x:dizi){
            if(Liste.add(x)){
                System.out.println(x+" Koleksiyona başarıyla eklenmiştir..");
            }else{
                System.out.println(x+" Koleksiyonda olduğundan Ekleme işlemi başarısız");
            }
        
        }
    }
    
}
