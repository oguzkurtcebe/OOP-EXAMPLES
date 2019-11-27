package Abstract2;

import java.nio.file.Files;

public class Test {
    public static void main(String[] args) {
      Sekiller kare = new Kare(9); 
      Sekiller dikdortgen=new Dikdortgen(4,6);
      
        SekillerinAlani(dikdortgen);
     
        
    
    }
public static void SekillerinAlani(Sekiller sekil){
    System.out.println("Alanı:"+sekil.alanHesapla());

}
}
