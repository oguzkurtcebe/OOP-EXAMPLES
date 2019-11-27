package GenericsSiniflar2;

public class Main {

    public static void main(String[] args) {
        DizilerSinifi<String> stringDiziYaz = new DizilerSinifi<String>();
        DizilerSinifi<Integer> integerDiziYaz = new DizilerSinifi<Integer>();
        DizilerSinifi<Character> characterDiziYaz = new DizilerSinifi<Character>();

        String[] stringDizisi = {"daf", "wgv", "dqfq"};
        Integer[] integerDizisi = {1, 4, 7};
        Character[] characterDizisi = {'G', 'S', 'T'};

        stringDiziYaz.diziYaz(stringDizisi);
        characterDiziYaz.diziYaz(characterDizisi);
        integerDiziYaz.diziYaz(integerDizisi);
      

    }

    

}
