package factory.model.impl;

import factory.model.DbConector;

public class MySqlConnector implements DbConector {


    @Override
    public void connect() {
        System.out.println("Mysql Connect");
    }

    @Override
    public void disconnect() {
        System.out.println("Mysql Disconnect");

    }
}
