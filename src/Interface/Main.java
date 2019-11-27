package Interface;

class DatabaseManager {

    public void addDatabase(IDatabase database) {
        database.add();
    }

    public void deleteDatabase(IDatabase database) {
        database.delete();
    }

    public void updateDatabase(IDatabase database) {
        database.update();
    }

    public void editDatabase(IDatabase database) {
        database.edit();
    }

}

public class Main {

    public static void main(String[] args) {
        DatabaseManager manager = new DatabaseManager();
        System.out.println("***Mysql***");
        manager.addDatabase(new MysqlDatabase());
        manager.deleteDatabase(new MysqlDatabase());
        manager.updateDatabase(new MysqlDatabase());
        manager.editDatabase(new MysqlDatabase());

        System.out.println("***MongoDB***");
        manager.addDatabase(new MongoDatabase());
        manager.deleteDatabase(new MongoDatabase());
        manager.updateDatabase(new MongoDatabase());
        manager.editDatabase(new MongoDatabase());

        System.out.println("***Oracle***");
        manager.addDatabase(new OracleDatabase());
        manager.deleteDatabase(new OracleDatabase());
        manager.updateDatabase(new OracleDatabase());
        manager.editDatabase(new OracleDatabase());
    }

}
