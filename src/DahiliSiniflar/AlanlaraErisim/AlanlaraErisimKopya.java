package DahiliSiniflar.AlanlaraErisim;

public class AlanlaraErisimKopya {

    public static void main(String[] args) {
        String stringDizisi[] = {"csc", "dadca", "fwgva"};
        Integer integerDizisi[] = {9, 4, 6};
        AlanlaraErisimKopya.StringDiziYazdir stringDiziYaz=new AlanlaraErisimKopya().new StringDiziYazdir();
        AlanlaraErisimKopya.IntegerDiziYazdir integerDiziYaz=new AlanlaraErisimKopya().new IntegerDiziYazdir();
        
        stringDiziYaz.diziYaz(stringDizisi);
        integerDiziYaz.diziYaz(integerDizisi);
        
    }

    private class StringDiziYazdir {

        private void diziYaz(String[] stringDizisi) {
            for (String x : stringDizisi) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    protected class IntegerDiziYazdir {

        protected void diziYaz(Integer[] integerDizisi) {
            for (Integer x : integerDizisi) {
                System.out.print(x+" ");
            }
        }

    }

}
