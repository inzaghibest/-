// 定义抽象中介者
public abstract class Mediator {
    protected ConcreteColleague1 c1;
    protected ConcreteColleague2 c2;
    protected ConcreteColleague3 c3;

    public void setC1(ConcreteColleague1 c1)
    {
        this.c1 = c1;
    }

    public void setC2(ConcreteColleague2 c2)
    {
        this.c2 = c2;
    }

    public void setC3(ConcreteColleague3 c3)
    {
        this.c3 = c3;
    }

    public ConcreteColleague1 getC1()
    {
        return this.c1;
    }

    public ConcreteColleague2 getC2()
    {
        return this.c2;
    }

    public ConcreteColleague3 getC3()
    {
        return this.c3;
    }

    // 中介者模式中中介者负责协调各个对象之间的逻辑关系
    public abstract void C1ToC2();
    public abstract void C1ToC3();
    public abstract void C2ToC3();
}
