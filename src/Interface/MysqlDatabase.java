package Interface;

public class MysqlDatabase implements IDatabase{

    @Override
    public void add() {
        System.out.println("Mysql Eklendi");
    }

    @Override
    public void delete() {
        System.out.println("Mysql silindi");    }

    @Override
    public void update() {
        System.out.println("Mysql Güncenlendi");    }

    @Override
    public void edit() {
        System.out.println("Mysql düzenlendi");    }
    
}
