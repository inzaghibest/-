public class ConcreteClass2 extends AbstractClass {
    @Override
    protected void step1() {
        System.out.println("ConcreteClass2 Step1");
    }

    @Override
    protected void step2() {
        System.out.println("ConcreteClass2 Step2");
    }

    @Override
    protected void step3() {
        System.out.println("ConcreteClass2 Step3");
    }

//    @Override
//    public void templateMethod() {
//        this.step2();
//        this.step1();
//    }
}
