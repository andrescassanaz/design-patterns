package Factory.model;

public class DbConectorFactory {
    public static IdbConector getConnector(String tipeOfConnector){

        if(tipeOfConnector.equals("mysql")){
            return new MySqlConnector();
        } else if (tipeOfConnector.equals("postgresql")){
            return new PostgreSqlConnector();
        }else {
            return new SqlServerConnector();
        }

    }
}