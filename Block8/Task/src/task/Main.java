package task;

import task.location.MushroomsMeadow;
import task.location.RiverSide;

/**
 * Created on 7:17 29.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setLocation(new RiverSide());
        human.doSomething();

        human.setLocation(new MushroomsMeadow());
        human.doSomething();

        human.setLocation(new MushroomsMeadow());
        human.doSomething();

        human.setLocation(new MushroomsMeadow());
        human.doSomething();
    }
}
