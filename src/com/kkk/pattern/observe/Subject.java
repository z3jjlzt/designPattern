package com.kkk.pattern.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kkk on 2016/9/5.
 */
public class Subject {
    /**
     * 保存所有订阅者
     */
    private List<MObserver> observers = new ArrayList<>();

    /**
     * 添加订阅者
     * @param observer
     */
    public void attach(MObserver observer){
        observers.add(observer);
    }

    public void detach(MObserver observer){
        observers.remove(observer);
    }

    public void Notify(){
        for (MObserver observer : observers) {
            observer.update(this);
        }
    }

}
