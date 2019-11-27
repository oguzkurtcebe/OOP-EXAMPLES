package DahiliSiniflar.Static;

public class Main {

    public static class StringDiziYaz {

        public void diziYaz(String[] dizi) {
            for (String x : dizi) {
                System.out.print(x + ",");
            }
            System.out.println();
        }
    }   

    protected static class DoubleDiziYaz {

        protected static void diziYaz(Double[] dizi) {
            for (Double x : dizi) {
                System.out.print(x + ",");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[] stringDizisi = {"sdsf", "wfw", "gwgvcwq"};
        StringDiziYaz stringDiziYaz = new Main.StringDiziYaz();
        stringDiziYaz.diziYaz(stringDizisi);

        Double doubleDizisi[] = {1.2, 2.3, 3.4, 5.0};
        DoubleDiziYaz doubleDiziYaz = new Main.DoubleDiziYaz();
        
        doubleDiziYaz.diziYaz(doubleDizisi);
    }

}
