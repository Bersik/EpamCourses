package task.state;

import task.Human;

/**
 * Created on 7:04 29.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public class Mushroomer implements Activity {
    @Override
    public void doSomething(Human context) {
        System.out.println("I'm a mushroomer");
    }
}
