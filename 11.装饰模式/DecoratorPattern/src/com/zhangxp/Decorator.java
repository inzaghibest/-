package com.zhangxp;

/**
 * Created by zhangxp on 2020/7/13.
 */
public class Decorator extends Component {
    private Component component;

    public Decorator(Component component)
    {
        this.component = component;
    }

    @Override
    public void doSomething()
    {
        this.component.doSomething();
    }
}
