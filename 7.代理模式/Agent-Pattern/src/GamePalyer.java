public class GamePalyer implements IGamePalyer{
    private String palyerName = "";
//    public GamePalyer(String name)
//    {
//        this.palyerName = name;
//    }
    // 构造函数中的IGamePalyer在实际中是在构造时去判断的一些条件，谁可以来创建对象。即代理我的条件。
    public GamePalyer(IGamePalyer player, String name)
    {
//        if (player == null)
////        {
//////            throw new Exception("不能创建真实的角色!");
////        }
        this.palyerName = name;
    }
    @Override
    public void login(String name, String password) {
        System.out.println("name: " + name + "password: " + password + "登录成功!");
    }

    @Override
    public void killBoss() {
        System.out.println(this.palyerName + "killBoss");
    }

    @Override
    public void upgrade() {
        System.out.println(this.palyerName + "upgrade");
    }
}
