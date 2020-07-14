/**
 * Created by zhangxp on 2020/7/14.
 */
public class Client {
    public static void main(String[] args)
    {
        Originator org = new Originator();
        Caretaker caretaker = new Caretaker();
        org.setState(3);
        // 创建一个备忘录
        caretaker.setMemento(org.createMemento());
        // 状态改变
        org.setState(5);
        // 恢复
        org.restoreMemento(caretaker.getMemento());
        System.out.println(org.getState());
    }
}
