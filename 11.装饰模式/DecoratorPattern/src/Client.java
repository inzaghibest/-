public class Client {
    public static void main(String[] args)
    {
        SchoolReport report = new FouthGradeSchoolReport();

        report = new HighScoreDecorator(report);
        report = new SortDecorator(report);

        report.report();
        report.sign("张三");

    }
}
