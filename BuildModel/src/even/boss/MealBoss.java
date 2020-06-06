package even.boss;

import even.build.IMealBuilder;
import even.object.MealPackage;


/**
 * 套餐老板，指定要哪种套餐，就要哪种构建者去构建对应的对象
 */
public class MealBoss {

    private IMealBuilder builder;

    public MealBoss(IMealBuilder builder){
        this.builder = builder;
    }

    public MealPackage buildMeal(){
        //组装套餐
        builder.createMeal();
        return builder.getMeal();
    }
}
