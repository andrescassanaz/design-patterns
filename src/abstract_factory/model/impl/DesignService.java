package abstract_factory.model.impl;

import abstract_factory.model.ComputerService;

public class DesignService implements ComputerService {

    public void showTypeOfService() {
        System.out.println("Design Serivice");
    }
}
