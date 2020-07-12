// 具体实现的中介者
public class ConcreteMediator extends Mediator{
    @Override
    public void C1ToC2() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }

    @Override
    public void C1ToC3() {
        super.c1.selfMethod1();
        super.c3.selfMethod3();;
    }

    @Override
    public void C2ToC3() {
        super.c2.selfMethod2();
        super.c3.selfMethod3();
    }
}
