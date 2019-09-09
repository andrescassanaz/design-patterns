package abstract_factory.model.impl;

import abstract_factory.model.ComputerService;

public class VideoGameService implements ComputerService {

    public void showTypeOfService() {
        System.out.println("VideoGame Service");
    }
}
