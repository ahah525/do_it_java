package chapter11.alone1_2;

import java.util.Objects;

class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    // equals() 재정의
    @Override
    public boolean equals(Object obj) {
        // Object 인스턴스 자료형이 MyDate 이면
        if(obj instanceof MyDate) {
            MyDate date = (MyDate) obj; // MyDate 형으로 변환
            return (this.day == date.day && this.month == date.month && this.year == date.year);
        }
        return false;
    }

    // hasCode() 재정의(equals 메서드 재정의할 때 같이 재정의해야함)
    @Override
    public int hashCode() {
        return day * 10 + month * 101 + year * 102;
    }
}

public class MyDateTest {
    public static void main(String[] args){
        MyDate date1 = new MyDate(9, 18, 2004);
        MyDate date2 = new MyDate(9, 18, 2004);
        
        // 논리적으로 같은지 확인
        System.out.println(date1.equals(date2));

        // hasCode()값이 동일한지 확인
        System.out.println(date1.hashCode());
        System.out.println(date2.hashCode());

        // 실제 주소값 비교
        System.out.println(System.identityHashCode(date1));
        System.out.println(System.identityHashCode(date2));
    }
}
