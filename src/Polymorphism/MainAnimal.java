package Polymorphism;

public class MainAnimal {
public static void speaktry(Animal animal){
    animal.speak();
}

    public static void main(String[] args) {
        /*  Animal animal = new Animal("Hayvan");
        Dog dog = new Dog("Karabaş");
        Bird bird = new Bird("Limon");
        Horse horse = new Horse("Şahbatur");

        animal.speak();
        dog.speak();
        bird.speak();
        horse.speak();*/
        System.out.println("Çok biçimlilik kullanırsak eğer..");
       Animal animal = new Animal("Hayvannn");
//        Animal animal2 = new Bird("limon");
//        Animal animal3 = new Dog("Karabaş");
//        Animal animal4 = new Horse("Şahbatur");
//        
//        animal.speak();
//        animal2.speak();
//        animal3.speak();
//        animal4.speak();
       speaktry(new Bird("Papağan"));
    }

}

 class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("Hayvan Konuşuyor..");
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " Havlıyor..");
    }

}

class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " Ötüyor...");
    }

}

class Horse extends Animal {

    @Override
    public void speak() {
        System.out.println(getName() + " kişniyor");
    }

    public Horse(String name) {
        super(name);
    }

}
