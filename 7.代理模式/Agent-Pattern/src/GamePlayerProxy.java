public class GamePlayerProxy implements IGamePalyer{
    private GamePalyer gamePalyer = null;
//    public GamePlayerProxy(GamePalyer gamePalyer)
//    {
//        this.gamePalyer = gamePalyer;
//    }
    public GamePlayerProxy(String name)
    {
        this.gamePalyer = new GamePalyer(this, name);
    }

    public void Before()
    {
        System.out.println("GamePalyerProxy Before...");
    }

    public void After()
    {
        System.out.println("GamePalyerProxy After...");
    }
    @Override
    public void login(String name, String password) {
        this.Before();
        this.gamePalyer.login(name, password);
        this.After();
    }

    @Override
    public void killBoss() {
        this.Before();
        this.gamePalyer.killBoss();
        this.After();
    }

    @Override
    public void upgrade() {
        this.Before();
        this.gamePalyer.upgrade();
        this.After();
    }
}
