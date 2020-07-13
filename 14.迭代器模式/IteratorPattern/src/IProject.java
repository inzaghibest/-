/**
 * Created by zhangxp on 2020/7/13.
 */
public interface IProject {
    public void add(String name, int num, int cost);
    public String getProjectInfo();
    // 获得一个可以遍历的对象
    public IProjectIterator iterator();
}
