package Polymorphism4;
public class Main {
    public static void main(String[] args) {
        Fransız fransız = new Fransız("Pogba");  
        Ingiliz ingiliz=new Ingiliz("Gerard");   
        Turk turk=new Turk("Ahmet");
        speakTry(fransız);
      
    }
    public static void speakTry(Milletler millet){
       millet.speak();
    }
}
