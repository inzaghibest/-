/**
 * Created by zhangxp on 2020/7/14.
 */
// 开门状态下的电梯,可以执行的动作为close.
public class OpenningState extends LiftState {
    @Override
    public void close()
    {
        // 修改环境状态
        super.context.setLiftState(Context.closingState);
        // 动作委托CloseState来执行
        super.context.getLiftState().close();
    }

    @Override
    public void open()
    {
        System.out.println("电梯门开启...");
    }

    @Override
    public  void run()
    {
        // do nothing
    }

    @Override
    public void stop()
    {
        // do nothing
    }
}
