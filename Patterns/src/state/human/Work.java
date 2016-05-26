package state.human;

/**
 * Created on 10:36 26.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public class Work implements Activity{

    @Override
    public void doSomething(Human context) {
        System.out.println("Work!!!");
        context.setState(new WeekEnd());
    }
}
