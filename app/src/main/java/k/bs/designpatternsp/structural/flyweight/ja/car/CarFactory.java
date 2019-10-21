package k.bs.designpatternsp.structural.flyweight.ja.car;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    Map pool;

    public CarFactory() {
        pool = new HashMap();
    }

    public Car getCar(String key) {
        Car car = (Car) pool.get(key);
        if (car == null) {
            car = new Car(key);
            pool.put(key, car);
            System.out.println("새로 생성 : " + key);
        } else {
            System.out.println("재사용 : " + key);
        }
        return car;
    }
}
