package chapter13.exercise7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Book {
    private String name;    // 이름
    private int price;      // 가격

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


public class LibraryTest {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("자바", 25000));
        bookList.add(new Book("파이썬", 15000));
        bookList.add(new Book("안드로이드", 30000));

        // 모든 책 가격의 합
        int totalPrice = bookList.stream().
                mapToInt(b->b.getPrice()).sum();
        System.out.println("모든 책의 가격의 합 = " + totalPrice + "원");

        // 책의 가격이 20000원 이상인 책의 이름을 정렬하여 출력
        bookList.stream().
                filter(b->b.getPrice() >= 20000).
                map(b->b.getName()).
                sorted().
                forEach(s->System.out.println(s));
    }
}
