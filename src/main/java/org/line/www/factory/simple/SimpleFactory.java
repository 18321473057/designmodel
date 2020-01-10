package org.line.www.factory.simple;

import org.line.www.factory.Bean.Apple;
import org.line.www.factory.Bean.Fruits;
import org.line.www.factory.Bean.Orange;
import org.line.www.factory.Bean.Pear;

/**简单工厂*/
public class SimpleFactory {

    public Fruits getBean(String name) {
        if ("apple".equals(name)) {
            return new Apple();
        } else if ("orange".equals(name)) {
            return new Orange();
        } else if ("pear".equals(name)) {
            return new Pear();
        } else {
            return null;
        }
    }
}
