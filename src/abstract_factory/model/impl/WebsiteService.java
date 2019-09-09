package abstract_factory.model.impl;

import abstract_factory.model.ComputerService;

public class WebsiteService implements ComputerService{

    public void showTypeOfService() {
        System.out.println("Website Service");
    }
}



