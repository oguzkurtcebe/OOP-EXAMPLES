package DahiliSiniflar;
public class DahiliSiniflarKopya {

    public static void main(String[] args) {
        
        String dizi[]={"dada","dfc","gbev"};

DahiliSiniflarKopya.DiziYaz diziYaz=new DahiliSiniflarKopya().new DiziYaz();
diziYaz.diziYazdir(dizi);

    }
public class DiziYaz{
    
    
    public void diziYazdir(String []dizi){
        for(String x:dizi){
            System.out.println(x+",");
    }
        
    }
}    


}
