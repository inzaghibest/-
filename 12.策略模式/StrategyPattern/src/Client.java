/**
 * Created by zhangxp on 2020/7/13.
 */
public class Client {
    public static void main(String[] args)
    {
        Strategy s1 = new ConcreteStrategy1();
        Strategy s2 = new ConcreteStrategy2();

        Context context = new Context(s1);
        context.doAnything();

        context = new Context(s2);
        context.doAnything();

        System.out.println(Calculator.ADD.exec(4,6));
        System.out.println(Calculator.SUB.exec(8,6));

    }
}
