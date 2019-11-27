package nesneyonelim;

public class Main {

    public static void main(String[] args) {
        Dikdörtgen dd1 = new Dikdörtgen();
        Dikdörtgen dd2 = new Dikdörtgen();
        int x;
        dd1.en = 5;
        dd1.boy = 20;
        dd2.en=7;
        dd2.boy=20;
        
        
        System.out.println("Alan:" + dd1.DikdörtgenAlanıHesapla());
        System.out.println("Çevre:" + dd1.DikdörtgenCevresiniHesapla());
          System.out.println("Alan:" + dd2.DikdörtgenAlanıHesapla());

    }

}
