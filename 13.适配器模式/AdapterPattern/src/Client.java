/**
 * Created by zhangxp on 2020/7/13.
 */
public class Client {
    public static void main(String[] args)
    {
        Target t1 = new ConcreteTarget();
        t1.doSomething();

        Target t2 = new Adapter();
        t2.doSomething();
    }
}
