package org.line.www.factory.function;

import org.line.www.factory.Bean.Apple;
import org.line.www.factory.Bean.Fruits;
import org.line.www.factory.Bean.Orange;
import org.line.www.factory.Bean.Pear;

//工厂方法
public class FactoryFunction {

    public Fruits getApple() {
        return new Apple();
    }

    public Fruits getOrange() {
        return new Orange();
    }

    public Fruits getPear() {
        return new Pear();
    }
}
