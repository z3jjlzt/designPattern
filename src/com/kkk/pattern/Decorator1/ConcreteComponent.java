package com.kkk.pattern.Decorator1;

/**
 * 具体构件
 * Created by z3jjlzt on 2018/1/9.
 */
public class ConcreteComponent extends Component{

    @Override
    public void operator() {
        System.out.println("多兰之剑");
    }
}
