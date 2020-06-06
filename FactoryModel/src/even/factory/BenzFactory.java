package even.factory;

import even.obeject.BenzCar;
import even.obeject.ICar;

public class BenzFactory implements IFactory{


    @Override
    public ICar getProduct() {
        return new BenzCar();
    }
}
