package com.hank.iterator;

import java.util.ArrayList;
import java.util.List;

public class NameIterator implements   Iterator{
    private List list = new ArrayList();
    private int cursor =0;

    public NameIterator(List list){
        this.list = list;
    }

    public boolean hasNext(){
        if(cursor == list.size()){
            return false;
        }
        return true;
    }

    public Object First(){
        return this.list.get(0);
    }

    public Object next(){
        Object obj= null;
        if (this.hasNext()){
            obj = this.list.get(cursor++);
        }
        return obj;
    }
}
