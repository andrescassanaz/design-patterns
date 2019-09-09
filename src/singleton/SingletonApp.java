package singleton;

import java.util.logging.Logger;

public class SingletonApp {

    private final static Logger LOGGER = Logger.getLogger("App");


    public static void main(String[] args) {
        DbConector dbConectorOne = DbConector.getInstance();
        DbConector dbConectorTwo = DbConector.getInstance();

        LOGGER.info("Same Implementation: "+ dbConectorOne.equals(dbConectorOne));
    }
}
