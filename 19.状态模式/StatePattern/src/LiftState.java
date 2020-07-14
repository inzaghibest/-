/**
 * Created by zhangxp on 2020/7/14.
 */
// 抽象电梯状态
public abstract  class LiftState {
    protected Context context;
    public void setContext(Context context)
    {
        this.context = context;
    }
    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();
}
