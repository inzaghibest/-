public class ConcreteColleague2 extends Colleague{
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    //  自己的业务逻辑 self-method
    public void selfMethod2()
    {
        System.out.println("C2 干了一会儿活");
    }

    // 依赖方法, dep-method
    public void depMethod2()
    {
        System.out.println("C2找C3一起干活");
        // 自己需要和别人沟通的逻辑，交由中介者处理
        super.mediator.C2ToC3();
    }
}
