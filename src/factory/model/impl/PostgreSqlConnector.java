package factory.model.impl;

import factory.model.DbConector;

public class PostgreSqlConnector implements DbConector {
    @Override
    public void connect() {
        System.out.println("PostgreSQL Connect");
    }

    @Override
    public void disconnect() {
        System.out.println("PostgreSQL Disconnect");

    }
}
