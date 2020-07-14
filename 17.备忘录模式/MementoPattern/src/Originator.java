/**
 * Created by zhangxp on 2020/7/14.
 */
// 发起人角色
public class Originator {
    private int state = 0;

    public void setState(int state)
    {
        this.state = state;
    }

    public int getState()
    {
        return this.state;
    }

    // 创建备忘录
    public Memento createMemento()
    {
        return new Memento(this.state);
    }

    // 恢复备忘录
    public void restoreMemento(Memento memento)
    {
        this.setState(memento.getState());
    }
}
