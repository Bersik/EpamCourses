package task.location;

import task.Human;
import task.see.Fish;
import task.state.FisherMan;

/**
 * Created on 7:09 29.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public class RiverSide implements Location{

    @Override
    public void where() {
        System.out.println("I'm in the river side");
    }

    @Override
    public void doSomething(Human context) {
        where();
        context.setSee(new Fish());
        context.setState(new FisherMan());
    }
}
