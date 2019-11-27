package EsnekBaglanti;

public class ArabaIslemleriImpl2 implements ArabaIslemleri {

    @Override
    public void arabaBilgiYazdir(Araba araba) {
        System.out.println(araba.getMarka());
        System.out.println(araba.getModel());
        System.out.println(araba.getUretimYili());
        System.out.println(araba.getRenk());

    }

    @Override
    public boolean arabaKaydet(Araba araba) {
        boolean durum = arabalarList.add(araba);
        System.out.println("Araç Kaydedildi");
        arabaBilgiYazdir(araba);
        System.out.println("**************");
        return durum;
    }

    @Override
    public boolean arabaSil(Araba araba) {
        boolean durum=arabalarList.remove(araba);
        return durum;
        
    }

    @Override
    public void arabaListele() {
        System.out.println("------");
       for(Araba x: arabalarList){
           arabaBilgiYazdir(x);
           System.out.println("------");
       }

    }

}
