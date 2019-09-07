package Factory.model;

public class SqlServerConnector implements IdbConector {

    @Override
    public void connect() {
        System.out.println("SqlServer Connect");
    }

    @Override
    public void disconnect() {
        System.out.println("SqlServer Disconnect");

    }
}
