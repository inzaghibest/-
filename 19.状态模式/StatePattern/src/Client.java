/**
 * Created by zhangxp on 2020/7/14.
 */
public class Client {
    public static void main(String[] args)
    {
        Context context = new Context();
        // 定义初始状态电梯开启
        context.setLiftState(new OpenningState());
        context.run();

        context.close();
        context.run();
        context.stop();
        context.open();
        context.close();
    }
}
