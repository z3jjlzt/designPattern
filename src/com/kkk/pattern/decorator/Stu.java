package com.kkk.pattern.decorator;

import java.util.Map;

/**
 * Created by kkk on 16-9-25.
 */
public abstract class Stu extends Pancakes {
    Pancakes pancakes;

    public Stu(Pancakes pancakes) {
        this.pancakes = pancakes;
    }

    public Map<String, Integer> add(Map<String, Integer> foods){

        return pancakes.add(foods);
    }
}
