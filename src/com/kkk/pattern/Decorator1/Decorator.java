package com.kkk.pattern.Decorator1;

/**
 * 抽象装饰者
 * Created by z3jjlzt on 2018/1/9.
 */
public class Decorator extends Component{
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operator() {
        component.operator();
    }
}
