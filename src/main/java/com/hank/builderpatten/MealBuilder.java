package com.hank.builderpatten;

/**
 * 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象。
 */
public class MealBuilder {

    //设置一个套餐组合
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
