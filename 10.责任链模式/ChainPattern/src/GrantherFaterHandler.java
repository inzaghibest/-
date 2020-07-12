// 定义祖父处理节点
public class GrantherFaterHandler extends Handler {
    @Override
    protected Level getHandlerLevel() {
        Level level = new Level();
        level.setLevel(3);
        return level;
    }

    @Override
    protected Response echo(Request request) {
        Response res = new Response();
        res.setResponse(request.getRequest() + " 爷爷处理成功！同意了 ");
        return res;
    }
}
