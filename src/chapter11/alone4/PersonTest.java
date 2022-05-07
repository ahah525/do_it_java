package chapter11.alone4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonTest {
    public static void main(String[] args) throws ClassNotFoundException {
        // Person 클래스의 Class 클래스 가져오기
        Class personClass = Class.forName("chapter11.alone4.Person");  // 클래스 이름으로 가져오기

        // 모든 생성자 가져오기
        Constructor[] cons = personClass.getConstructors();
        for(Constructor c : cons) {
            System.out.println(c);
        }
        System.out.println();

        // 모든 멤버 변수 가져오기
        Field[] fields = personClass.getFields();
        for(Field f : fields) {
            System.out.println(f);
        }
        System.out.println();

        // 모든 메서드 가져오기
        Method[] methods = personClass.getMethods();
        for(Method m : methods) {
            System.out.println(m);
        }
        System.out.println();
    }
}
