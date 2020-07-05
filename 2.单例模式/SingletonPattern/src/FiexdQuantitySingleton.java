import java.util.ArrayList;
import java.util.Random;

public class FiexdQuantitySingleton {
    // 定义最多能产生的实例数量
    private static int maxNumOfSingleton = 2;
    // 维护每个实例的属性信息
    private static ArrayList<String> nameList = new ArrayList<String>();
    // 定义一个列表，容纳所有的皇帝实例
    private static ArrayList<FiexdQuantitySingleton> singletons = new ArrayList<FiexdQuantitySingleton>();
    // 当前皇帝的序列号
    private static int countNumOfSingleton = 0;
    // 产生所有的对象
    static {
        for (int i = 0; i<maxNumOfSingleton; i++) {
            singletons.add(new FiexdQuantitySingleton("实例:" + i ));
        }
    }
    private FiexdQuantitySingleton() {

    }

    private FiexdQuantitySingleton(String name) {
        nameList.add(name);
    }

    // 随机获取一个实例对象
    public static FiexdQuantitySingleton getInstance() {
        Random random = new Random();
        countNumOfSingleton = random.nextInt(maxNumOfSingleton);
        return singletons.get(countNumOfSingleton);
    }

    // 实例的方法
    public void say() {
        System.out.println(nameList.get(countNumOfSingleton));
    }
}
