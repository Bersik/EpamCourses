package task.location;

import task.Human;
import task.see.Beast;
import task.see.Mushroom;
import task.state.Hunter;
import task.state.Mushroomer;

import java.util.Random;

/**
 * Created on 7:11 29.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public class MushroomsMeadow implements Location {
    @Override
    public void where() {
        System.out.println("I'm in the mushrooms meadow");
    }

    @Override
    public void doSomething(Human context) {
        where();
        if (new Random().nextBoolean()) {
            context.setSee(new Mushroom());
            context.setState(new Mushroomer());
        } else {
            context.setSee(new Beast());
            context.setState(new Hunter());
        }
    }
}
