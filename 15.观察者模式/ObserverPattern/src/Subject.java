import java.util.Vector;

/**
 * Created by zhangxp on 2020/7/13.
 */
// 被观察者
public abstract class Subject {
    // 观察者列表
    private Vector<Observer> observers = new Vector<Observer>();

    public void addObserver(Observer observer)
    {
        this.observers.add(observer);
    }

    public void delObserver(Observer observer)
    {
        this.observers.remove(observer);
    }

    // 通知所有观察者
    public void notifyObservers()
    {
        for (int i = 0; i<observers.size(); i++)
        {
            observers.get(i).update();
        }
    }
}
