package com.kkk.pattern.decorator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kkk on 16-9-25.
 */
public class Test {
    public static void main(String[] args) {
        Pancakes pancakes = new Order();
        Stu xiaomin = new Xiaomin(pancakes);
        Map<String,Integer> map = new HashMap<>();

        Stu xiaohong = new OutSale(xiaomin);
        Map<String,Integer> sale = new HashMap<>();
        sale.put("外送",3);
        sale.put("鸡蛋",2);
        sale.put("培根",4);

        Map<String, Integer> tar = xiaohong.add(sale);

        Map.Entry<String, Integer> next = tar.entrySet().iterator().next();
        System.out.println(next.getKey()+next.getValue());
    }
}
