package Abstract;
public class Main {
    public static void main(String[] args) {
        AbstractDatabase abs=new MysqlDatabase();
        AbstractDatabase abs2=new MongoDatabase();
   
        abs.Add();
        abs.Delete();
        abs2.Add();
        abs2.Delete();
        abs.Update();
        abs2.Update();
    }
    
}
