package task.state;

import task.Human;

/**
 * Created on 11:05 26.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public class Hunter implements Activity{
    @Override
    public void doSomething(Human context) {
        System.out.println("I'm a hunter");
    }
}
