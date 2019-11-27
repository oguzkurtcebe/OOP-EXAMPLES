package Kalitim;

public class MainHayvan {
    public static void main(String[] args) {
        Kedi kedi=new Kedi("Var", "pişik", "Erkek", 4,"Miyav");
        System.out.println("***Kedinin Bilgileri***");
        System.out.println(kedi.getBilgiler());
        Kopek kopek=new Kopek("Karabaş", "Erkek","Köpppek maması",4,"Hav Hav");
        System.out.println("***Köpeğin Bilgileri***");
        System.out.println(kopek.getBilgiler());
    
    
    }
    
}
