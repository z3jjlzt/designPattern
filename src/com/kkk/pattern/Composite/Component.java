package com.kkk.pattern.Composite;

import java.util.Objects;

/**
 * Created by z3jjlzt on 2018/1/8.
 */
public abstract class Component {
    protected String name;

    public Component() {
    }

    public Component(String name) {
        this.name = name;
    }

    public abstract void display();

    public abstract void removeChild(Component c);

    public abstract void addChild(Component c);

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Component{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Component component = (Component) o;
        return Objects.equals(name, component.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
