package Abstract;
public abstract class AbstractDatabase  {
   
    public void Add(){
        System.out.println("Eklendi");
        
    }
    public void Delete(){
        System.out.println("Silindi");
        
    }


abstract void Update();
abstract void Get();
}
