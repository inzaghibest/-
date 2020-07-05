// 线程不安全的单例模式实现
public class NoSafeSingleton {
    public static NoSafeSingleton noSafeSingleton = null;

    private NoSafeSingleton() {

    }

    public static NoSafeSingleton getInstance() {
        if (noSafeSingleton == null) {
            noSafeSingleton =  new NoSafeSingleton();
        }
        return noSafeSingleton;
    }
}
