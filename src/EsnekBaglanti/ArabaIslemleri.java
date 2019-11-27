package EsnekBaglanti;

import java.util.ArrayList;

public interface ArabaIslemleri {

    public ArrayList<Araba> arabalarList = new ArrayList<Araba>();

    public void arabaBilgiYazdir(Araba araba);

    public boolean arabaKaydet(Araba araba);

    public boolean arabaSil(Araba araba);

    public void arabaListele();
}
