public class Client {
    public static void main(String[] args)
    {
        // 声明所有的处理节点
        Handler handler1 = new FatherHandler();
        Handler handler2 = new SonHandler();
        Handler handler3 = new GrantherFaterHandler();

        // 设置链的执行顺序
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        // 构造请求
        Request request = new Request();
        Level level = new Level();
        level.setLevel(2);
        request.setLevel(level);
        request.setRequest("我想出去逛街!");

        Response response =  handler1.handlerMessage(request);
        System.out.println(response.getResponse());
    }
}
