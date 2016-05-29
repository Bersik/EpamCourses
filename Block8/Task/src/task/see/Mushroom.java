package task.see;

import task.Human;
import task.state.Mushroomer;

/**
 * Created on 7:28 29.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public class Mushroom implements See{
    @Override
    public void see() {
        System.out.println("I'm see the mushroom");
    }

    @Override
    public void doSomething(Human context) {
        see();
        context.setState(new Mushroomer());
    }
}
