package DahiliSiniflar.Static;

public class MainKopya {

    protected static class StringDiziYaz {

        protected static void diziYaz(String[] dizi) {
            for (String x : dizi) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }

    protected static class IntegerDiziYaz {

        protected static void diziYaz(Integer[] dizi) {
            for (Integer x : dizi) {
                System.out.print(x);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        String[] stringDizisi = {"sdsf", "wfw", "gwgvcwq"};
        Integer[] integerDizi = {2, 5, 6};
        StringDiziYaz stringDiziYaz = new MainKopya.StringDiziYaz();
        IntegerDiziYaz integerDiziYaz = new MainKopya.IntegerDiziYaz();
    
    
    stringDiziYaz.diziYaz(stringDizisi);
    integerDiziYaz.diziYaz(integerDizi);
    
    Saglama saglam=new Saglama();
    saglam.main();
    }

}
class Saglama{
    public  void main() {
        MainKopya.StringDiziYaz str=new MainKopya.StringDiziYaz();
        String[] stringDizisi = {"sdsf", "wfw", "gwgvcwq"};
        System.out.println("sağlama clası");
        str.diziYaz(stringDizisi);
    }
}