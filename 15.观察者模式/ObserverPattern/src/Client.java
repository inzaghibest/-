/**
 * Created by zhangxp on 2020/7/13.
 */
public class Client {
    public static void main(String[] args)
    {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.addObserver(observer);
        subject.doSomething();
    }
}
