public class Singleton {
    private static final Singleton SINGLETON = new Singleton();

    // 限制产生多个实例
    private Singleton() {

    }

    // 通过该方法获得实例对象
    public static Singleton getSingleton() {
        return SINGLETON;
    }

    // 类中其他方法，尽量是static
    public static void doSomethings() {
        System.out.println("我是单例");
    }

}
