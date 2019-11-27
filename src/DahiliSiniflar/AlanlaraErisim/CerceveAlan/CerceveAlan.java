package DahiliSiniflar.AlanlaraErisim.CerceveAlan;

public class CerceveAlan {

    private static Double[] doubleDizi = {1.0, 2.3, 3.1, 4.0};
    protected static  String[] stringDizi = {"dsf", "ujhy", "dsfgdg", "mtrh"};

    public static void main(String[] args) {
        CerceveAlan cerceveAlan = new CerceveAlan();
        CerceveAlan.DoubleDiziYaz doubleDiziYaz = new CerceveAlan().new DoubleDiziYaz();
        CerceveAlan.StringDiziYaz stringDiziYaz = new CerceveAlan().new StringDiziYaz();
        
        doubleDiziYaz.diziYaz(doubleDizi);
        stringDiziYaz.diziYaz(stringDizi);

    }

    public class DoubleDiziYaz {

        public void diziYaz(Double[] dizi) {
            for (Double x : dizi) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public class StringDiziYaz {

        public void diziYaz(String[] dizi) {
            for (String x : dizi) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
