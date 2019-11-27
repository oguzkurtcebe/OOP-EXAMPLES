package GenericsMetodlar2;
public class Main {

    public static void main(String[] args) {
        Kare kare=new Kare(6);
        Kare kare2=new Kare(5);
        Kare sonucKare=alanKarsilastir(kare, kare2);
        System.out.println("Büyük kare:"+sonucKare.alanBul());
        
        Dikdortgen dikdortgen=new Dikdortgen(6, 7);
        Dikdortgen dikdortgen1=new Dikdortgen(4, 9);
        Dikdortgen  sonucDikdortgen =alanKarsilastir(dikdortgen1, dikdortgen);
        System.out.println("Büyük Dikdörtgen:"+sonucDikdortgen.alanBul());
                
        
    }
               //Metod Tipi                        //Dönüş Tipi
public static <Genel extends Sekiller> Genel alanKarsilastir(Genel x,Genel y){
    if(x.alanBul()>y.alanBul()){
        return x;
    }
    else{
        return y;
    }
    

}
}
