package DahiliSiniflar;

import DahiliSiniflar.AlanlaraErisim.AlanlaraErisim;

public class DahiliSinif {

    public static void main(String[] args) {

        DahiliSinif.DiziYaz diziYaz = new DahiliSinif().new DiziYaz();
        String dizi[] = {"23e", "err", "444"};
        diziYaz.diziYaz(dizi);
        
     
    }

    public class DiziYaz {

        public void diziYaz(String[] dizi) {
            for (String x : dizi) {
                System.out.print(x + ",");
            }
        }
    }

}
