package abstract_factory.model;

import abstract_factory.model.ComputerService;

public interface ServiceFactory {
    public ComputerService createService();
}
