package abstract_factory;

import abstract_factory.model.ComputerService;
import abstract_factory.model.ServiceFactory;
import abstract_factory.model.impl.DesignServiceFactory;
import abstract_factory.model.impl.VideoGameFactory;
import abstract_factory.model.impl.WebsiteFactory;

public class AbstractFactoryApp {

    public static void main(String[] args) {
        createService(new VideoGameFactory());
        createService(new DesignServiceFactory());
        createService(new WebsiteFactory());
    }

    private static void createService(ServiceFactory serviceFactory){
        ComputerService computerService = serviceFactory.createService();
        computerService.showTypeOfService();
    }

}
