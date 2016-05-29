package task.state;

import task.Human;

/**
 * Created on 6:55 29.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public interface Activity {

    void doSomething(Human context);
}
