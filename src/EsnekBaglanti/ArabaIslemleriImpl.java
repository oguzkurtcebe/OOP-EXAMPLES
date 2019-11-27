package EsnekBaglanti;

public class ArabaIslemleriImpl implements ArabaIslemleri {

    @Override
    public void arabaBilgiYazdir(Araba araba) {
        System.out.println(araba);    }

    @Override
    public boolean arabaKaydet(Araba araba) {
        boolean durum = arabalarList.add(araba);
        return durum;
    }

    @Override
    public boolean arabaSil(Araba araba) {
        boolean durum = arabalarList.remove(araba);
        return durum;
    }

    @Override
    public void arabaListele() {
        for (Araba x : arabalarList) {
            System.out.println(x);
        }

    }

}
