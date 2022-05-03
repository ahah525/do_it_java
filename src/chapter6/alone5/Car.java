package chapter6.alone5;

public class Car {
    private static int serialNum = 10000;  // 시리얼 번호
    int carNum;   // 자동차 번호

    public Car() {
        // 자동차 생성시 자동으로 자동차 번호 부여
        serialNum++;
        carNum = serialNum;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Car.serialNum = serialNum;
    }

    // 자동차 번호를 반환하는 메서드
    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }
}
