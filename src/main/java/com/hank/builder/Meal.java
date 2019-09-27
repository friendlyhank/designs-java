package com.hank.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象。
 */
public class Meal {
    //List去装Item
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for(Item item : items){
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for(Item item : items){
            System.out.println("Item :"+item.name());
            System.out.println("，Packing : "+item.packing().pack());
            System.out.println("，Price : "+item.price());
        }
    }
}
