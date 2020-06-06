package even.factory;

import even.obeject.BaomaCar;
import even.obeject.ICar;

/**
 * 具体工厂实现
 */
public class BaomaFactory  implements IFactory{

    @Override
    public ICar getProduct() {
        return new BaomaCar();
    }
}
