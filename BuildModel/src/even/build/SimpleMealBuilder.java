package even.build;

import even.object.MealPackage;
import even.object.SimpleMealPackage;

/**
 * 普通套餐的构建者
 */
public class SimpleMealBuilder extends MealPackage implements IMealBuilder{

    private SimpleMealPackage simpleMeal = new SimpleMealPackage();

    /**
     * 可以一键构建复杂对象，也可以通过下面的set方法进行链式调用，单独指定普通套餐属性
     * 如果想更灵活方便，还可以接收参数进来
     */
    public void createMeal() {
        simpleMeal.setName("普通套餐");
        simpleMeal.setPrice(58.0);
        simpleMeal.setAmount(1);
        simpleMeal.setChicken("炸鸡");
        simpleMeal.setCole("可口可乐");
        simpleMeal.setIcecream("巧乐兹");
    }


    public SimpleMealBuilder setMealName(String name){
        simpleMeal.setName(name);
        return this;
    }

    public SimpleMealBuilder setMealPrice(double price){
        simpleMeal.setPrice(price);
        return this;
    }

    public SimpleMealBuilder setMealAmount(int amount){
        simpleMeal.setAmount(amount);
        return this;
    }

    public SimpleMealBuilder setMealChicken(String chicken){
        simpleMeal.setChicken(chicken);
        return this;
    }

    public SimpleMealBuilder setMealCole(String cole){
        simpleMeal.setCole(cole);
        return this;
    }

    public SimpleMealBuilder setMealIcecream(String icecream){
        simpleMeal.setIcecream(icecream);
        return this;
    }

    /**
     * 将构建的对象返回
     * @return
     */
    @Override
    public MealPackage getMeal() {
        return simpleMeal;
    }
}
