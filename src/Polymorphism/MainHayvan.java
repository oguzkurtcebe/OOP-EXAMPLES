package Polymorphism;

public class MainHayvan {

    public static void main(String[] args) {
        konusma(new Hayvan("Hayvan"));
        konusma(new Kus("Limon"));
        konusma(new Kopek("Karabaş"));
        konusma(new At("Şahbatur"));
    }

    public static void konusma(Hayvan hayvan) {
         hayvan.seslendirme();
    }

}

class Hayvan {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hayvan(String name) {
        this.name = name;
    }

    public void seslendirme() {
        System.out.println("Hayvan konuşuyor");
    }
}

class Kopek extends Hayvan {

    public Kopek(String name) {
        super(name);
    }

    @Override
    public void seslendirme() {
        System.out.println(getName() + " havlıyor..");
    }

}

class Kus extends Hayvan {

    public Kus(String name) {
        super(name);
    }

    @Override
    public void seslendirme() {
        System.out.println(getName() + "  Ötüyor..");

    }

}

class At extends Hayvan {

    public At(String name) {
        super(name);
    }

    @Override
    public void seslendirme() {
        System.out.println(getName() + "  Kişniyor..");

    }

}
