// 调用者类，负责执行具体的命令
public class Invoker {
    private Command command;

    public void setCommand(Command command)
    {
        this.command = command;
    }

    public void action()
    {
        this.command.execute();
    }
}
