/**
 * Created by zhangxp on 2020/7/13.
 */
public enum  Calculator {
    ADD("+"){
        public int exec(int a, int b)
        {
            return a+b;
        }
    },
    SUB("-"){
        public int exec(int a, int b)
        {
            return a-b;
        }
    };
    String value = "";
    private Calculator(String value)
    {
        this.value = value;
    }

    public String getValue()
    {
        return this.value;
    }

    // 声明一个抽象函数
    public abstract int exec(int a, int b);
}
