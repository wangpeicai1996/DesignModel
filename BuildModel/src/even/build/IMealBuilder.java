package even.build;

import even.object.MealPackage;

public interface IMealBuilder {

    //一键构建对象，具体怎么构建在子类中实现
    void createMeal();

    MealPackage getMeal();

}
