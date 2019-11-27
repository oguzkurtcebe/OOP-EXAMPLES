package Polymorphism4;
public class Ingiliz extends Milletler {
    
    public Ingiliz(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName()+" İngilizce Konuşuyor");
    }
    
}
