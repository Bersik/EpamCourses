package task.see;

import task.Human;
import task.state.Hunter;

/**
 * Created on 7:12 29.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public class Beast implements See {
    @Override
    public void see() {
        System.out.println("I'm see the beast");
    }

    @Override
    public void doSomething(Human context) {
        see();
        context.setState(new Hunter());
    }
}
