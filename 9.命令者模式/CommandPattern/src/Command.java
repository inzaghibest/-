import javax.sound.midi.Receiver;

// 抽象命令类,每个命令类必须具有一个excute()方法
public abstract class Command {
    //
    protected final Receiver receiver;

    public Command(Receiver _receiver)
    {
        this.receiver = _receiver;
    }
    public abstract void execute();
}
