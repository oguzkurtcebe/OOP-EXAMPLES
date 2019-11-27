package Polymorphism4;
public class Turk extends Milletler{
    
    public Turk(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(this.getName()+" Türkçe Konuşuyor");    }
    
}
