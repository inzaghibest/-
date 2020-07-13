import java.util.ArrayList;

/**
 * Created by zhangxp on 2020/7/13.
 */
public class ProjectIterator implements IProjectIterator {
    private ArrayList<IProject> projects = new ArrayList<IProject>();

    private int currentItem = 0;

    public ProjectIterator(ArrayList<IProject> projects)
    {
        this.projects = projects;
    }

    // 判断是否还有元素必须实现
    public boolean hasNext()
    {
        boolean b = true;
        if (this.currentItem >= projects.size() || this.projects.get(currentItem) == null)
        {
            b = false;
        }
        return b;
    }

    // 取得下一个值
    public IProject next()
    {
        return (IProject)this.projects.get(this.currentItem++);
    }

    // 删除一个对象
    public void remove()
    {

    }
}
