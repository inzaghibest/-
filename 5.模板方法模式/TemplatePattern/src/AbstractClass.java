public abstract class AbstractClass {
    protected abstract void step1();

    protected abstract void step2();

    protected abstract void step3();

    // 模板方法
    public void templateMethod() {
        this.step1();
        this.step2();
        if (this.isStep3())
        {
            this.step3();
        }
    }

    protected boolean isStep3()
    {
        return true;
    }
}
