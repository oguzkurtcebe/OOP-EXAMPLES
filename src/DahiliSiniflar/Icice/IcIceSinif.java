package DahiliSiniflar.Icice;

import javax.crypto.spec.IvParameterSpec;

public class IcIceSinif {

    class StringDiziYaz {

        class IntegerDiziYaz {

            public void diziYaz(Integer[] dizi) {
                for (Integer x : dizi) {
                    System.out.print(x + ",");
                }
                System.out.println();
            }
        }

        public void diziYaz(String[] dizi) {
            for (String x : dizi) {
                System.out.print(x + ",");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Integer integerDizisi[] = {2, 3, 7, 8, 1};
        String stringDizisi[] = {"ert", "fsf", "btr"};
        IcIceSinif.StringDiziYaz.IntegerDiziYaz integerDiziYaz = new IcIceSinif().new StringDiziYaz().new IntegerDiziYaz();
        IcIceSinif.StringDiziYaz stringDiziYaz = new IcIceSinif().new StringDiziYaz();

        stringDiziYaz.diziYaz(stringDizisi);
        integerDiziYaz.diziYaz(integerDizisi);

    }

}
 
    

