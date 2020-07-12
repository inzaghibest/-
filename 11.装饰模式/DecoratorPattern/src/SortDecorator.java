public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    // 汇报排名情况
    private void reportSort() {
        System.out.println("这次排名11");
    }

    @Override
    public void report()
    {
        super.report();
        this.reportSort();
    }
}
