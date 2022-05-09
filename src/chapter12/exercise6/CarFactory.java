package chapter12.exercise6;

import java.awt.*;
import java.util.HashMap;

public class CarFactory {
    private static CarFactory instance = new CarFactory();
    HashMap<String, Car> carMap = new HashMap<>();

    public CarFactory() {
    }

    public static CarFactory getInstance(){
        if(instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar(String name){
        // 중복 검사
        if(carMap.containsKey(name)) {
            // 이름이 같은 차가 있다면
            return carMap.get(name);    // 키값이 name인 Car 객체(value) 반환
        }
        Car car = new Car(name);
        carMap.put(name, car);   // hashMap에 추가
        return car;
    }
}
