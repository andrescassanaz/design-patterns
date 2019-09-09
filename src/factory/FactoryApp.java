package factory;

import factory.model.DbConectorFactory;
import factory.model.DbConector;

public class FactoryApp {
    public static void main(String[] args) {

        DbConector mysqlConector = DbConectorFactory.getConnector("mysql");
        DbConector postgresqlConector = DbConectorFactory.getConnector("postgresql");
        DbConector sqlserverConector = DbConectorFactory.getConnector("sqlserver");

        mysqlConector.connect();
        mysqlConector.disconnect();

        postgresqlConector.connect();
        postgresqlConector.disconnect();

        sqlserverConector.connect();
        sqlserverConector.disconnect();


    }

}

