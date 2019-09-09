package factory.model.impl;

import factory.model.DbConector;

public class SqlServerConnector implements DbConector {

    @Override
    public void connect() {
        System.out.println("SqlServer Connect");
    }

    @Override
    public void disconnect() {
        System.out.println("SqlServer Disconnect");

    }
}
