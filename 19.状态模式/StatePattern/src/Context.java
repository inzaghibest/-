/**
 * Created by zhangxp on 2020/7/14.
 */
// 环境角色
public class Context {
    // 定义出所有电梯的状态
    public final static OpenningState openningState = new OpenningState();
    public final static ClosingState closingState = new ClosingState();
    public final static RunningState runningState = new RunningState();
    public final static StoppingState stoppingState = new StoppingState();

    // 定义一个电梯当前的状态
    private LiftState liftState;
    public LiftState getLiftState()
    {
        return this.liftState;
    }

    // 每次环境状态改变时,记录当前的状态类,此状态类会执行下一步的动作
    // 并且将当前的环境通知给各个状态类.
    public void setLiftState(LiftState liftState)
    {
        this.liftState = liftState;
        // 把当前环境通知到各个实现类中
        this.liftState.setContext(this);
    }

    public void open()
    {
        this.liftState.open();
    }

    public void close()
    {
        this.liftState.close();
    }

    public void run()
    {
        this.liftState.run();
    }

    public void stop()
    {
        this.liftState.stop();
    }
}
