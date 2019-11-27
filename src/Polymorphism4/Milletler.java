package Polymorphism4;
public class Milletler {
private String name;    

    public Milletler(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
public void speak(){
    System.out.println(this.name+" Konuşuyor");
}
}
