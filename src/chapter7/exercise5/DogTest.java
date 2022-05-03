package chapter7.exercise5;

import java.util.ArrayList;

public class DogTest {
    public static void main(String[] args){
        ArrayList<Dog> dogs = new ArrayList<>();    // ArrayList 선언

        dogs.add(new Dog("나비", "치와와"));
        dogs.add(new Dog("초코", "푸들"));
        dogs.add(new Dog("딸기", "포메"));
        dogs.add(new Dog("장군", "불독"));
        dogs.add(new Dog("백구", "진돗개"));

        for (Dog dog : dogs) {
            System.out.println(dog.showDogInfo());
        }
    }
}
