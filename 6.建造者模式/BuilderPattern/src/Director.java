import java.util.ArrayList;

public class Director {
    private ArrayList<String> sequence = new ArrayList<String>();

    private BenzBuilder benzBuilder = new BenzBuilder();

    private BMWBuilder bmwBuilder = new BMWBuilder();

    public BenzModel getABenzModel()
    {
        this.sequence.clear();
        // ABenz的执行顺序
        sequence.add("start");
        sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return (BenzModel)this.benzBuilder.getCarModel();
    }

    public BenzModel getBBenzModel()
    {
        this.sequence.clear();
        // ABenz的执行顺序
        sequence.add("start");
        sequence.add("alarm");
        sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel)this.benzBuilder.getCarModel();
    }

    public BenzModel getCBenzModel()
    {
        this.sequence.clear();
        // ABenz的执行顺序
        sequence.add("alarm");
        sequence.add("start");
        sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel)this.benzBuilder.getCarModel();
    }

    public BMWModel getBMWModel()
    {
        this.sequence.clear();
        // ABenz的执行顺序
        sequence.add("alarm");
        sequence.add("start");
        sequence.add("stop");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel)this.bmwBuilder.getCarModel();
    }
}
