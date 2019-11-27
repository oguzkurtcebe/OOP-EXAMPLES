package DahiliSiniflar.AlanlaraErisim;

public class AlanlaraErisim {

    public static void main(String[] args) {
        AlanlaraErisim.StringDiziYaz stringDiziYaz = new AlanlaraErisim().new StringDiziYaz();
        AlanlaraErisim.IntegerDiziYaz integerDiziYaz = new AlanlaraErisim().new IntegerDiziYaz();

        String stringDizi[] = {"234", "adsfg", "sadf"};
        int integerDizi[] = {1, 2, 3, 8, 7};

        stringDiziYaz.diziYaz(stringDizi);
        integerDiziYaz.diziYaz(integerDizi);

    }

    private class StringDiziYaz {

        private void diziYaz(String[] dizi) {
           

            for (String x : dizi) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    protected class IntegerDiziYaz {

        protected void diziYaz(int[] dizi) {
            for (int x : dizi) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

}
