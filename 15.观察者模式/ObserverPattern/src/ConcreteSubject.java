/**
 * Created by zhangxp on 2020/7/13.
 */
public class ConcreteSubject extends Subject {
    public void doSomething()
    {
        System.out.println("我做点事情吧");
        super.notifyObservers();
    }
}
