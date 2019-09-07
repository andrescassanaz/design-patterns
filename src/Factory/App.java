package Factory;

import Factory.model.DbConectorFactory;
import Factory.model.IdbConector;

public class App {
    public static void main(String[] args) {

        IdbConector mysqlConector = DbConectorFactory.getConnector("mysql");
        IdbConector postgresqlConector = DbConectorFactory.getConnector("postgresql");
        IdbConector sqlserverConector = DbConectorFactory.getConnector("sqlserver");

        mysqlConector.connect();
        mysqlConector.disconnect();

        postgresqlConector.connect();
        postgresqlConector.disconnect();

        sqlserverConector.connect();
        sqlserverConector.disconnect();


    }

}

