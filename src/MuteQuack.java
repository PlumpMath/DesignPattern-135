/**
 * Created by MT403 on 1/25/2016.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        // can't quack
        System.out.println("I can't Quack");
    }
}
