package even.client;

import even.factory.BaomaFactory;
import even.factory.BenzFactory;
import even.factory.IFactory;
import even.obeject.BaomaCar;
import even.obeject.BenzCar;

public class FactoryClient {

    public static void main(String[] args) {
        IFactory factory = new BaomaFactory();
        BaomaCar car = (BaomaCar) factory.getProduct();
        car.setName("宝马m6");
        car.setColor("红色");
        car.setSeat("四座");
        car.setCentral("全屏中控");
        car.setPrice(2000000);
        System.out.println("car = " + car + " " + car.getName()+ " "+ car.getColor() + " " + car.getPrice());

        IFactory factory1 = new BenzFactory();
        BenzCar car1 = (BenzCar) factory1.getProduct();
        car1.setType("越野型");
        car1.setWindow("全景天窗");
        car1.setName("G");
        car1.setColor("黑色");
        car1.setPrice(3780000);
        System.out.println("car = " + car1 + " " + car1.getName()+ " "+ car1.getColor() + " " + car1.getPrice());

    }
}
