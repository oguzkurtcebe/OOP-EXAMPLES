package DahiliSiniflar.Icice;

public class IcIceSinifKopya {

    public static void main(String[] args) {
        String[] stringDizisi = {"fsv", "fwvwaew", "besvsv"};
        Integer[] integerDizisi = {7, 4, 8, 9};
        IcIceSinifKopya.StringDizisiYazdir.IntegerDizisiYazdir integerDizisiYazdir = new IcIceSinifKopya().new StringDizisiYazdir().new IntegerDizisiYazdir();
        IcIceSinifKopya.StringDizisiYazdir stringDizisiYazdir=new IcIceSinifKopya().new StringDizisiYazdir();
        
        integerDizisiYazdir.diziYazdir(integerDizisi);
        stringDizisiYazdir.diziYazdir(stringDizisi);
    }

    class StringDizisiYazdir {

        public void diziYazdir(String[] dizi) {
            for (String x : dizi) {
                System.out.print(x + ",");
            }
        }

        class IntegerDizisiYazdir {

            public void diziYazdir(Integer[] dizi) {
                for (Integer x : dizi) {
                    System.out.print(x + ",");
                }
            }
        }

    }
}
