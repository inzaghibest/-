public class ConcreteColleague3 extends Colleague {
    public ConcreteColleague3(Mediator mediator) {
        super(mediator);
    }

    //  自己的业务逻辑 self-method
    public void selfMethod3()
    {
        System.out.println("C3 干了一会儿活");
    }

    // 依赖方法, dep-method
    public void depMethod3()
    {
        System.out.println("C3找C2一起干活");
        // 自己需要和别人沟通的逻辑，交由中介者处理
        super.mediator.C1ToC3();
    }
}
