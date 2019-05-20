package com.hank.builderpatten;

/**
 * 创建实现 Packing 接口的实体类。(食品的包装)
 */
public class Wrapper implements Packing{
    //实现Packing的接口
    @Override
    public String pack(){
        return "Wrapper";
    }
}
