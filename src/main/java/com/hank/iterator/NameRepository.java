package com.hank.iterator;

import java.util.ArrayList;
import java.util.List;

public class NameRepository {
    private List list = new ArrayList();

    public Iterator iterator() {
        return new NameIterator(list);
    }


    public void add(Object obj) {
        list.add(obj);
    }

    public void remove(Object obj) {
        list.remove(obj);
    }
}
