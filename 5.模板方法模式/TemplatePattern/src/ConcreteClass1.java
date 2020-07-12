public class ConcreteClass1 extends AbstractClass{
    private boolean isStep3 = true;
    @Override
    protected void step1() {
        System.out.println("ConcreteClass1 Step1");
    }

    @Override
    protected void step2() {
        System.out.println("ConcreteClass1 Step2");
    }

    @Override
    protected void step3() {
        System.out.println("ConcreteClass1 Step3");
    }

    public void setStep3(boolean isStep3) {
        this.isStep3 = isStep3;
    }

    @Override
    protected boolean isStep3() {
        return this.isStep3;
    }

}
