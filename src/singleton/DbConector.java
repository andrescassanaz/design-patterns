package singleton;

import java.util.logging.Logger;

public class DbConector {

    private final static Logger LOGGER = Logger.getLogger("IdbConector");

    private static DbConector instance;

    private boolean isConnected = false;

    private DbConector() {}

    public static DbConector getInstance() {
        if (instance == null) {
            instance = new DbConector();
        }
        return instance;
    }

    public void connect(){
        LOGGER.info("Connected to the database");
        isConnected = true;
    };

    public void disconnect(){
        LOGGER.info("Disconnected to the database");
        isConnected = false;
    };

    public Boolean isConnected(){
        return isConnected;
    }
}
