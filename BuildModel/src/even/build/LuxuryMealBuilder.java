package even.build;

import even.object.LuxuryMealPackage;
import even.object.MealPackage;

public class LuxuryMealBuilder extends MealPackage implements IMealBuilder {

    private LuxuryMealPackage luxuryMeal = new LuxuryMealPackage();

    public void createMeal() {
        luxuryMeal.setName("豪华套餐");
        luxuryMeal.setPrice(168);
        luxuryMeal.setAmount(1);
        luxuryMeal.setChicken("蜜汁烤鸡");
        luxuryMeal.setCole("百事可乐");
        luxuryMeal.setIcecream("哈格达斯");
        luxuryMeal.setChips("炸薯条");
        luxuryMeal.setCoffe("星巴克咖啡");
        luxuryMeal.setPizza("榴莲披萨");
    }


    public LuxuryMealBuilder setMealName(String name){
        luxuryMeal.setName(name);
        return this;
    }

    public LuxuryMealBuilder setMealPrice(double price){
        luxuryMeal.setPrice(price);
        return this;
    }

    public LuxuryMealBuilder setMealAmount(int amount){
        luxuryMeal.setAmount(amount);
        return this;
    }

    public LuxuryMealBuilder setMealChicken(String chicken){
        luxuryMeal.setChicken(chicken);
        return this;
    }

    public LuxuryMealBuilder setMealCole(String cole){
        luxuryMeal.setCole(cole);
        return this;
    }

    public LuxuryMealBuilder setMealIcecream(String icecream){
        luxuryMeal.setIcecream(icecream);
        return this;
    }

    public LuxuryMealBuilder setMealCoffe(String coffe){
        luxuryMeal.setCoffe(coffe);
        return this;
    }


    public LuxuryMealBuilder setMealChips(String chips){
        luxuryMeal.setChips(chips);
        return this;
    }

    public LuxuryMealBuilder setMealPizza(String pizza){
        luxuryMeal.setPizza(pizza);
        return this;
    }

    @Override
    public MealPackage getMeal() {
        return luxuryMeal;
    }


}
