/**
 * Created by zhangxp on 2020/7/13.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public void doAnything()
    {
        this.strategy.doSomething();
    }
}
