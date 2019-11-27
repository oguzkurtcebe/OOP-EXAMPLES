package yapilandirici;

public class main {

    public static void main(String[] args) {
        Araba arb = new Araba("Mercedes", "E220d", 2017, "Siyah");
        Araba arb2 = new Araba("Bmw", "525Xdrive", 2018, "Beyaz");
    
        System.out.println("Birinci arabanın Özellikleri");
        System.out.println("Marka:" + arb.Marka);
        System.out.println("Model:" + arb.Model);
        System.out.println("Yıl:" + arb.yil);
        System.out.println("Renk:" + arb.renk);
        System.out.println("**********");
        System.out.println("İkinci Arabanın Özellikleri");
        System.out.println("Marka:" + arb2.Marka);
        System.out.println("Model:" + arb2.Model);
        System.out.println("Yıl:" + arb2.yil);
        System.out.println("Renk:" + arb2.renk);
    
        
    }

}
