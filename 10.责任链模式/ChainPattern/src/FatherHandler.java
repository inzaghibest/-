// 定义father处理节点
public class FatherHandler extends Handler {
    @Override
    protected Level getHandlerLevel() {
        Level level = new Level();
        level.setLevel(1);
        return level;
    }

    @Override
    protected Response echo(Request request) {
        Response res = new Response();
        res.setResponse(request.getRequest() + " 父亲处理成功！同意了 ");
        return res;
    }
}
