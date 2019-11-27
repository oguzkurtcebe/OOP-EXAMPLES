package Kompozisyon;

import nesneyonelim.Futbolcu;

class Araba {
 Motor mtr=new Motor();
   
    
public void HareketZamani(){
 mtr.calistir();
    System.out.println("Yola Çıkalım");
}
public void DurmaZamani(){
    mtr.durdur();
    System.out.println("Eve vardık");
}
    public static void main(String[] args) {
        Araba araba=new Araba();
        araba.HareketZamani();
        System.out.println("*****");
        araba.DurmaZamani();
    }
}