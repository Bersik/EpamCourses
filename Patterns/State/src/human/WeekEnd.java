package human;

/**
 * Created on 10:38 26.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public class WeekEnd implements Activity {
    private int count = 0;

    @Override
    public void doSomething(Human context) {
        if (count < 3) {
            System.out.println("Zzzz");
            count++;
        } else {
            context.setState(new Work());
        }
    }
}
