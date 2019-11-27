package DahiliSiniflar.Static2;

public class Main {

    private static Double[] doubleDizisi = {1.2, 2.3, 3.4, 5.0};
    protected static String[] stringDizisi = {"sdm", "flwpişl", "öcwşl"};

    public static class StringDiziYaz {
        public void diziYaz(String[]dizi){
            for(String x:dizi){
                System.out.print(x+",");
            }
            System.out.println();
        }
    }

     public static class DoubleDiziYaz {
        public void diziYaz(Double[]dizi){
            for(Double x:dizi){
                System.out.print(x+",");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       StringDiziYaz stringDiziYaz=new Main.StringDiziYaz();
       DoubleDiziYaz doubleDiziYaz=new Main.DoubleDiziYaz();
       
       stringDiziYaz.diziYaz(stringDizisi);
       doubleDiziYaz.diziYaz(doubleDizisi);
    }

}
