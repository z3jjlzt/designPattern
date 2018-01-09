package com.kkk.pattern.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by z3jjlzt on 2018/1/8.
 */
public class Folder extends Component{
    private List<Component> lst = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void display() {
        lst.forEach(x -> {
            System.out.print(name + "/");
            x.display();
        });
    }

    @Override
    public void removeChild(Component component) {
        lst.remove(component);
    }

    @Override
    public void addChild(Component component) {
        lst.add(component);
    }
}
