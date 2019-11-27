package DahiliSiniflar.YerelDahiliSiniflar;
public class Main {

    public static void main(String[] args) {
        String[]stringDizisi={"sasa","wqs","dqfc"};
    class StringDiziYaz{
        public void diziYaz(String []dizi){
            for(String x:dizi){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    StringDiziYaz stringDiziYaz=new StringDiziYaz();
    stringDiziYaz.diziYaz(stringDizisi);
    
    }
    
}
