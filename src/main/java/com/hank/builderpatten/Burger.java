package com.hank.builderpatten;

/**
 * 创建实现 Item 接口的抽象类，该类提供了默认的功能。
 */
//这里没有实现Item的所有方法居然也不会报错
public abstract class Burger implements Item{

    //汉堡是纸盒包装的Wrapper
    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
