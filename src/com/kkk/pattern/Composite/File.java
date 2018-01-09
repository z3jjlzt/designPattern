package com.kkk.pattern.Composite;

/**
 * Created by z3jjlzt on 2018/1/8.
 */
public class File extends Component{

    public File(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println(name);
    }

    @Override
    public void removeChild(Component c) {
        System.out.println();
    }

    @Override
    public void addChild(Component c) {
        System.out.println();
    }
}
