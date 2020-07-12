

public class FouthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("尊敬的家长您好:");
        System.out.println(" .....................");
        System.out.println(" 语文:62  数学:84 英语:69 自然: 88");
        System.out.println(" ...................");
        System.out.println("         家长签名:      ");
    }

    @Override
    public void sign(String name) {
        System.out.println("[" + name + "]");
    }
}
