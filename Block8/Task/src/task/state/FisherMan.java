package task.state;

import task.Human;

/**
 * Created on 11:06 26.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public class FisherMan implements Activity {

    @Override
    public void doSomething(Human context) {
        System.out.println("I'm a fisherman");
    }
}

