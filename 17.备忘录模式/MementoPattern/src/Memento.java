/**
 * Created by zhangxp on 2020/7/14.
 */
// 备忘录角色
public class Memento {
    private int state;

    public Memento(int state)
    {
        this.state = state;
    }

    public int getState()
    {
        return this.state;
    }

    public void setState(int state)
    {
        this.state = state;
    }
}
