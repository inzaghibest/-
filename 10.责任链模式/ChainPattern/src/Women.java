public class Women implements IWomen {
    private int type = 0;
    private Request request = null;

    public Women(int type, Request request)
    {
        this.type = type;
        this.request = request;
    }
    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public Request getReuquest() {
        return this.request;
    }
}
