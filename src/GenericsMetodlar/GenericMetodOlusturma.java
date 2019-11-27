package GenericsMetodlar;
public class GenericMetodOlusturma {
    public static void main(String[] args) {
        String[]stringdizisi={"assa","fwfw","gevrfds"};
        Integer[]integerDizisi={2,3,4,1};
        Character[]characterDizisi={'d','f','a'};
        diziYaz(stringdizisi);
        diziYaz(integerDizisi);
        diziYaz(characterDizisi);
    }
   public static<Genel>void diziYaz(Genel[]dizi){
       for(Genel x:dizi){
           System.out.print(x);
   }
       System.out.println();
   } 
}
