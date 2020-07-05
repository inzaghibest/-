public class Minister {
    public static void main(String[] args) {
        for (int day = 0; day < 3; day++) {
            Singleton singleton = Singleton.getSingleton();
            singleton.doSomethings();
        }

        int num = 5;
        for (int i = 0; i<num; i++) {
            FiexdQuantitySingleton singleton = FiexdQuantitySingleton.getInstance();
            System.out.println("这是实例: ");
            singleton.say();
        }
    }
}
