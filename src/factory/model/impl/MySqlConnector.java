package Factory.model;

public class MySqlConnector implements IdbConector {


    @Override
    public void connect() {
        System.out.println("Mysql Connect");
    }

    @Override
    public void disconnect() {
        System.out.println("Mysql Disconnect");

    }
}
