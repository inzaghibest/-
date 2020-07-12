public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    // 汇报最高成绩
    private void reportHighScore() {
        System.out.println("这次语文最高75分,数学78分");
    }

    @Override
    public void report()
    {
        this.reportHighScore();
        super.report();
    }
}
