package even.client;

import even.boss.MealBoss;
import even.build.LuxuryMealBuilder;
import even.build.SimpleMealBuilder;
import even.object.LuxuryMealPackage;
import even.object.SimpleMealPackage;

public class TestClient {


    public static void main(String[] args) {
        //想要普通套餐,就给老板说，老板让普通套餐的构建者给你造一份普通套餐
        MealBoss boss1 = new MealBoss(new SimpleMealBuilder());
        SimpleMealPackage simpleMealPackage = (SimpleMealPackage) boss1.buildMeal();

        //经典的构建者模式，用链式调用构建对象，可以比较灵活的设置对象属性
        LuxuryMealPackage luxuryMealPackage1 = (LuxuryMealPackage)new LuxuryMealBuilder()
                .setMealAmount(1).setMealPrice(118).setMealChicken("豪华鸡").setMealIcecream("哈根达斯")
                .setMealCole("芬达").setMealChips("薯条").getMeal();

        //还是让老板一键生成豪华套餐比较方便
        MealBoss boss2 = new MealBoss(new LuxuryMealBuilder());
        LuxuryMealPackage luxuryMealPackage2 = (LuxuryMealPackage) boss2.buildMeal();

        System.out.println("普通套餐= " + simpleMealPackage.toString());
        System.out.println("豪华套餐1= " + luxuryMealPackage1.toString());
        System.out.println("豪华套餐2= " + luxuryMealPackage2.toString());

    }

}
