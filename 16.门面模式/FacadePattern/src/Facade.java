/**
 * Created by zhangxp on 2020/7/14.
 */
public class Facade {
    private ClassA classA = new ClassA();
    private ClassB classB = new ClassB();
    private ClassC classC = new ClassC();

    public void method1() {
        this.classA.doSomething();
        this.classC.doSomething();
    }

    public void method2()
    {
        this.classC.doSomething();
        this.classB.doSomething();
    }
}
