public class Client {
    public static void main(String[] args)
    {
        Mediator mediator = new ConcreteMediator();
        ConcreteColleague1 c1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 c2 = new ConcreteColleague2(mediator);
        ConcreteColleague3 c3 = new ConcreteColleague3(mediator);
        mediator.setC1(c1);
        mediator.setC2(c2);
        mediator.setC3(c3);
        c1.depMethod1();
        c2.depMethod2();
        c3.depMethod3();
    }
}
