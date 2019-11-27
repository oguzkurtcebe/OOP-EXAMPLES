package Abstract;
public class MongoDatabase extends AbstractDatabase{

   
    void Update() {
        System.out.println("Mongo Güncenlendi");
    }

    @Override
    void Get() {
        System.out.println("Mongo verileri aldı");
    
}
}