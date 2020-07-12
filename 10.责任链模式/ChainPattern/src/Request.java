// 每个请求含有一个请求的数据,以及请求的级别
public class Request {
    private String request = "";
    private Level level = null; // 请求的级别
    public Level getRequestLevel()
    {
        return this.level;
    }

    public void setLevel(Level level)
    {
        this.level = level;
    }

    public void setRequest(String request)
    {
        this.request = request;
    }

    public String getRequest()
    {
        return this.request;
    }
}
