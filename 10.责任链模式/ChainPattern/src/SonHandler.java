public class SonHandler extends Handler {
    @Override
    protected Level getHandlerLevel() {
        Level level = new Level();
        level.setLevel(2);
        return level;
    }

    @Override
    protected Response echo(Request request) {
        Response res = new Response();
        res.setResponse(request.getRequest() + " 儿子处理成功！同意了 ");
        return res;
    }
}
