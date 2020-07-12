import javax.sound.midi.Receiver;

public class ConcreteCommand1 extends Command {
    public  ConcreteCommand1(Receiver _receiver)
    {
        super(_receiver);
    }
    @Override
    public void execute() {

    }
}
