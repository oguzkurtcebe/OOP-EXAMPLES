package EsnekBaglanti;
public class Test {
    public static void main(String[] args) {
        Araba arabaMercedes = new Araba("Mercedes", "Cla180", 2014, "beyaz");
        Araba arabaBmw = new Araba("Bmw", "3.20", 2012, "siyah");
        Araba arabaAudi = new Araba("Audi", "A3", 2011, "kırmızı");
        
   ArabaIslemleri arabaIslemleri=new ArabaIslemleriImpl2();
   arabaIslemleri.arabaKaydet(arabaMercedes);
   arabaIslemleri.arabaKaydet(arabaBmw);
   arabaIslemleri.arabaKaydet(arabaAudi);

   
       
     

    }

}
