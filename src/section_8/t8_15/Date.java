package section_8.t8_15;

import java.util.Arrays;

public class Date {

    private static final int[] daysPerMonth = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final String[] months = new String[]{"","styczeń", "luty", "marzec", "kwiecieć", 
            "maj", "czerwiec", "lipiec", "sierpien", "wrzesien", "pazdziernik", "listopad", "grudzien"};
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException(String.format("day (%d) musi znajdowac się w zakresie 1-12", month));
        }

        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException(String.format("day (%d) poza zakresem dla dla danego miesiaca i roku", day));
        }

        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException(String.format("year (%d) poza zakresem dla dla danego miesiaca i roku", year));
        }

        this.month = month;
        this.day = day;
        this.year = year;
    }

    public Date(int totalDay, int year) {
        int tempMonth=1;
        int tempDay=totalDay;
        boolean leapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        while(tempDay>(daysPerMonth[tempMonth] +((tempMonth==2 && leapYear)?1:0))){
            tempDay-=(daysPerMonth[tempMonth] + ((tempMonth==2 && leapYear)?1:0));
            tempMonth++;
        }
        this.year = year;
        this.day = tempDay;
        this.month = tempMonth;
    }

    public Date(int day, String monthText, int year) {
        this(Arrays.asList(months).indexOf(monthText), day, year);
    }
    
    
    @Override
    public String toString() {
        return String.format("%d/%d/%d", day, month, year);
    }

    public String universalDate() {
        return String.format("%d-%d-%d", year, month, day);
    }

    public String textDate() {
        return String.format("%d %s %d", day, months[month], year);
    }

    public String totalDate() {
        return String.format("%d %d", getTotalDay(), year);
    }
    
    private int getTotalDay() {
        int totalDay=0;
        for (int i = 1; i <= month-1; i++) {
            totalDay+=daysPerMonth[i];
        }
        
        if(month>2 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
            totalDay-=1;
        }
        
        totalDay+=this.day;
        return totalDay;
    }

    public void nextDay() {
        if (this.day >= daysPerMonth[month]) {
            if (this.month == 12) {
                this.month = 1;
                this.year++;
                this.day = 1;
            } else if (this.month == 2){
                if((this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0)){
                    if (this.day == 29) {
                        this.day = 1;
                        this.month++;
                    }else {
                        this.day = 29;
                    }
                }else {
                    this.day = 1;
                    this.month++;
                }
            } else {
                this.month++;
                this.day = 1;
            }
        } else {
            this.day++;
        }
    }
}
