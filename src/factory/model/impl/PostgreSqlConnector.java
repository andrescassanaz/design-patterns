package Factory.model;

public class PostgreSqlConnector implements IdbConector {
    @Override
    public void connect() {
        System.out.println("PostgreSQL Connect");
    }

    @Override
    public void disconnect() {
        System.out.println("PostgreSQL Disconnect");

    }
}
