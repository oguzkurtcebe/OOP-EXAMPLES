package GenericsSiniflar;

import java.util.ArrayList;

public class Islemler <T>{
    private ArrayList<T>liste=new ArrayList<>();
  public void kaydet(T t)
  {
      liste.add(t);
  }    
public void sil(T t){
    liste.remove(t);
}

public void listele(){
    for(T t:liste){
        System.out.print(t);
    }
    System.out.println();
}
}
