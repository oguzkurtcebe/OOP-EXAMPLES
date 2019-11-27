
package Polymorphism4;
public class Fransız extends Milletler{
    
    public Fransız(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName()+" Fransızca Konuşuyor");
    }
    
}
