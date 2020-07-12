import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args)
    {
//        GamePalyer gamePalyer = new GamePalyer("zhangxp"); 不用知道真实的角色
//        IGamePalyer gamePalyer1 = new GamePlayerProxy("zhangxp");
////        gamePalyer1.login("zhangxp", "123");
////        gamePalyer1.killBoss();
////        gamePalyer1.upgrade();

        // 动态代理
        IGamePalyer player = new GamePalyer(null, "张三");
        // 定义一个handler
        InvocationHandler handler = new GamePlayIH(player);
        ClassLoader c1 = player.getClass().getClassLoader();
        // 动态产生一个代理
        IGamePalyer proxy = (IGamePalyer) Proxy.newProxyInstance(c1, new Class[]{IGamePalyer.class}, handler);
        proxy.login("zhangsan", "22222");
        proxy.killBoss();
        proxy.upgrade();
    }
}
