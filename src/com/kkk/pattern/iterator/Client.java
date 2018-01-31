package com.kkk.pattern.iterator;

import java.util.ArrayList;

/**
 * Created by z3jjlzt on 2018/1/31.
 */
public class Client {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("d");
        list.add("f");
        Room room = new Room(list);
        IIterator iterator = room.createIterator();
        while (iterator.hasNext())
        System.out.println(iterator.next());
    }
}
