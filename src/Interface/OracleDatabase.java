package Interface;

public class OracleDatabase implements IDatabase{

    @Override
    public void add() {
        System.out.println("Oracle Eklendi");
    }

    @Override
    public void delete() {
        System.out.println("Oracle silindi");    }

    @Override
    public void update() {
        System.out.println("Oracle Güncenlendi");    }

    @Override
    public void edit() {
        System.out.println("Oracle düzenlendi");    }
    
}
