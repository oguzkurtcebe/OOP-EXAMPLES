package GenericsMetodlar3;
public class TipParamaetresiKisitla {
    public static void main(String[] args) {
        String[]stringDizisi={"ada","gehg","t34"};
        Integer[]integerDizisi={1,2,3,4,5,6};
        Character[]characterDizisi={'d','g','h'};
        Double[]doubleDizisi={1.0,2.3,4.6,5.7};
        
     //   diziYaz(stringDizisi);
        diziYaz(integerDizisi);
       // diziYaz(characterDizisi);
        diziYaz(doubleDizisi);
    }
    public static<Genel extends Number>void diziYaz(Genel[]dizi){
        for(Genel x:dizi){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
