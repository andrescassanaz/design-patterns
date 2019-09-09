package abstract_factory.model.impl;

import abstract_factory.model.ComputerService;
import abstract_factory.model.ServiceFactory;

public class WebsiteFactory implements ServiceFactory {
    @Override
    public ComputerService createService() {
        return new WebsiteService();
    }
}
