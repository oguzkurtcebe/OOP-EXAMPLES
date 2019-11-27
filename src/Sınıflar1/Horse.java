package Sınıflar1;

import Sınıflar.Animal;

public class Horse extends Animal {
    
    public Horse(String name) {
        super(name);
    }
  public void speak(){
    
      
      System.out.println(this.name+" Konuşuyor");
  }
}
