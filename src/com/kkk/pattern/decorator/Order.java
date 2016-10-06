package com.kkk.pattern.decorator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kkk on 16-9-25.
 */
public class Order extends Pancakes{
    @Override
    Map<String, Integer> add(Map<String, Integer> foods) {
        Map<String,Integer> map = new HashMap<>();
        map.put("煎饼",5);
        return map;
    }
}
