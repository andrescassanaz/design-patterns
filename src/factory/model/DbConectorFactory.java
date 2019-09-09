package factory.model;

import factory.model.impl.MySqlConnector;
import factory.model.impl.PostgreSqlConnector;
import factory.model.impl.SqlServerConnector;

public class DbConectorFactory {
    public static DbConector getConnector(String tipeOfConnector){

        if(tipeOfConnector.equals("mysql")){
            return new MySqlConnector();
        } else if (tipeOfConnector.equals("postgresql")){
            return new PostgreSqlConnector();
        }else {
            return new SqlServerConnector();
        }

    }
}