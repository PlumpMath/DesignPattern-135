/**
 * Created by MT403 on 1/25/2016.
 */
public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyWithWings();
    }
}
