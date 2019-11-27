package Interface;

public class MongoDatabase implements IDatabase{

    @Override
    public void add() {
        System.out.println("MongoDB Eklendi");
    }

    @Override
    public void delete() {
        System.out.println("MongoDB silindi");    }

    @Override
    public void update() {
        System.out.println("MongoDB Güncenlendi");    }

    @Override
    public void edit() {
        System.out.println("MongoDB düzenlendi");    }
    
}
