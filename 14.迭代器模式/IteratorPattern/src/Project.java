import java.util.ArrayList;

/**
 * Created by zhangxp on 2020/7/13.
 */
public class Project implements IProject {
    private ArrayList<IProject> projects = new ArrayList<IProject>();

    private String name;
    private int num = 0;
    private int cost = 0;

    public Project()
    {

    }

    public Project(String name, int num, int cost)
    {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    public void add(String name, int num, int cost)
    {
        this.projects.add(new Project(name, num, cost));
    }

    public String getProjectInfo()
    {
        String info = "";

        info += "项目名称: " + this.name;
        info += "项目人数: " + this.num;
        info += "项目预算: " + this.cost;

        return info;
    }

    public IProjectIterator iterator()
    {
        return new ProjectIterator(this.projects);
    }
}
