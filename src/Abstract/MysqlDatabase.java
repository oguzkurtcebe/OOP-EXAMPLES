package Abstract;
public class MysqlDatabase extends AbstractDatabase{

   
    void Update() {
        System.out.println("Mysql Güncenlendi");
    }

    @Override
    void Get() {
        System.out.println("Mysql verileri aldı");
    
}
}