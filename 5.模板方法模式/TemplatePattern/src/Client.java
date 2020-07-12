public class Client {
    public static void main(String[] args) {
        ConcreteClass1 class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();
        class1.setStep3(false);
//        class1.setStep3()
        class1.templateMethod();
        class2.templateMethod();
    }
}
