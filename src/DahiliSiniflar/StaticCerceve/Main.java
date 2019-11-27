package DahiliSiniflar.StaticCerceve;
public class Main {
   protected static Double[] doubleDizisi = {1.2, 2.3, 3.4, 5.0};
    private static String[] stringDizisi = {"sdm", "flwpişl", "öcwşl"};
    
    private static class StringDiziYaz{
        private static void diziYaz(String[]dizi){
            for(String x:dizi){
                System.out.print(x+",");
            }
            System.out.println();
        }
    
    }
    protected static class DoubleDiziYaz{
        protected static void diziYaz(Double[]dizi){
            for(Double x:dizi){
                System.out.println(x+",");
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
