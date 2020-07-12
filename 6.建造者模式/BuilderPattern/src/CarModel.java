import java.util.ArrayList;

public abstract class CarModel {
    // 这个参数是各个方法的基本执行顺序
    private ArrayList<String> sequence = new ArrayList<String>();

    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();

    final public void run()
    {
        for (int i = 0; i<sequence.size(); i++)
        {
            String actionName = sequence.get(i);
            if (actionName.equalsIgnoreCase("start"))
            {
                this.start();
            }else if (actionName.equalsIgnoreCase("stop"))
            {
                this.stop();
            }else if (actionName.equalsIgnoreCase("alarm"))
            {
                this.alarm();
            }else if (actionName.equalsIgnoreCase("engineBoom"))
            {
                this.engineBoom();
            }
        }
    }

    final public void setSequence(ArrayList<String> sequence)
    {
        this.sequence = sequence;
    }
}
