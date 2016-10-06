package com.kkk.pattern.decorator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by kkk on 16-9-25.
 */
public class OutSale extends Stu {
    public OutSale(Pancakes pancakes) {
        super(pancakes);
    }
    public Map<String, Integer> add(Map<String, Integer> foods) {
        Map<String, Integer> src = super.add(foods);
        String tmp = src.keySet().iterator().next();
        Integer total = src.values().iterator().next();
        Iterator<String> iterator = foods.keySet().iterator();
        StringBuffer sb = new StringBuffer();
        sb.append(tmp);
        String key = null;
        while (iterator.hasNext()){
            key = iterator.next();
            if(key.equals("外送")) {
                sb.append(" " + key);
                total += foods.get(key);
            }
        }
        Map<String, Integer> out = new HashMap<>();
        out.put(sb.toString(),total);
        return out;

    }

}
