package com.kkk.pattern.iterator;

import java.util.List;

/**
 * 充当具体聚合类。
 * Created by z3jjlzt on 2018/1/31.
 */
public class Room extends Aggregate{
    private List<Object> lst;

    public Room(List<Object> lst) {
        this.lst = lst;
    }

    @Override
    public IIterator createIterator() {
        return new RoomIterator();
    }

    class RoomIterator implements IIterator{
        private int cursor = -1;

        @Override
        public Object first() {
            return Room.this.lst.get(0);
        }

        @Override
        public Object next() {
            return Room.this.lst.get(++cursor);
        }

        @Override
        public Object currentItem() {
            return Room.this.lst.get(cursor);
        }

        @Override
        public boolean hasNext() {
            return  cursor < Room.this.lst.size() -1 ? true : false;
        }
    }

}
