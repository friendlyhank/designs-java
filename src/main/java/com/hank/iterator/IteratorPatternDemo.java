package com.hank.iterator;

/*
 *迭代器模式
 */
public class IteratorPatternDemo {
    public static void main(String[] args){
        NameRepository ag = new NameRepository();
        ag.add("小明");
        ag.add("小红");
        ag.add("小刚");
        Iterator it = ag.iterator();
        while(it.hasNext()){
            String str = (String)it.next();
            System.out.println(str);
        }
    }
}
