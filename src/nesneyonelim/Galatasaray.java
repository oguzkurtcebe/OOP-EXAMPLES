
package nesneyonelim;

import java.util.ArrayList;

public class Galatasaray {
    

    public static void main(String[] args) {
       ArrayList<String>FutbolcuList=new ArrayList<String>();
       Futbolcu ftbl=new Futbolcu();
        
        FutbolcuList.add(ftbl.isim="Muslera");
        FutbolcuList.add(ftbl.isim="Mariano");
        FutbolcuList.add(ftbl.isim="Lyuindama");
        FutbolcuList.add(ftbl.isim="Marcao");
        FutbolcuList.add(ftbl.isim="Nagatomo");
        FutbolcuList.add(ftbl.isim="Seri");
        FutbolcuList.add(ftbl.isim="Donk");
        FutbolcuList.add(ftbl.isim="Belhanda");
        FutbolcuList.add(ftbl.isim="Babel");
        FutbolcuList.add(ftbl.isim="Feghouli");
        FutbolcuList.add(ftbl.isim="Diagne");
        
        System.out.println("Galatasarayın İlk On biri");
        for (String FutbolcuList1 : FutbolcuList) {
            System.out.println("*** "+FutbolcuList1);
        
        }
}
}