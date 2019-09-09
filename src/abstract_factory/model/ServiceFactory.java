package abstract_factory.model.impl;

import abstract_factory.model.ComputerService;

public interface ServiceFactory {
    public ComputerService createService();
}
