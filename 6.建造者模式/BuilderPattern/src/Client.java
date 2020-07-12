import java.util.ArrayList;

public class Client {
    public static void main(String[] args)
    {
//        ArrayList<String> sequence = new ArrayList<String>();
//        sequence.add("stop");
//        sequence.add("alarm");
//        sequence.add("start");
//        sequence.add("engineBoom");
//
//        BenzBuilder benzBuilder = new BenzBuilder();
//        benzBuilder.setSequence(sequence);
//        BenzModel benzModel = (BenzModel) benzBuilder.getCarModel();
//        benzModel.run();

        Director director = new Director();
        director.getABenzModel().run();
        director.getBBenzModel().run();
        director.getBMWModel().run();
        director.getCBenzModel().run();

//        BenzModel benzModel = new BenzModel();
//        benzModel.setSequence(sequence);
//        benzModel.run();
    }
}
