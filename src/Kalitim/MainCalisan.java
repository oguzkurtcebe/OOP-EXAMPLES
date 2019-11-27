package Kalitim;

public class MainCalisan{

    public static void main(String[] args) {
//        Calisan c1=new Calisan("Oğuz Kurtcebe","Bilişim",5000);
//        c1.bilgiler();
        Yonetici y1 = new Yonetici("oğuz kurtcebe", "Bilişim", 6000, 20);
        y1.bilgiler();
        y1.zam_durumu(120);
    }
};
