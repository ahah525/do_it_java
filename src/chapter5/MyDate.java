package chapter5;

import java.util.Calendar;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private boolean isValid = true;

    public MyDate(int day, int month, int year) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if(1 <= day && day <= 31) this.day = day;
                else isValid = false;
                break;
            case 4: case 6: case 9: case 11:
                if(1 <= day && day <= 30) this.day = day;
                else isValid = false;
                break;
            case 2:
                // 윤년일 경우 29일까지
                if((year % 4 == 0 &&  year % 100 != 0) || year % 400 == 0){
                    if(1 <= day && day <= 29) this.day = day;
                    else isValid = false;
                }
                // 윤년이 아닐 경우 28일까지
                else {
                    if(1 <= day && day <= 28) this.day = day;
                    else isValid = false;
                }
                break;
            default:
                isValid = false;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < 1 || month > 12) isValid = false;
        else this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        // 현재 년도보다 크면 오류 처리
        if(year > Calendar.getInstance().get(Calendar.YEAR)) isValid = false;
        else this.year = year;
    }

    public String isValid() {
        if(isValid) return "유효한 날짜입니다.";
        else return "유효하지 않은 날짜입니다.";
    }
}
