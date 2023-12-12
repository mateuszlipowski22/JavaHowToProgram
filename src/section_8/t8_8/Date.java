package section_8.t8_8;

public class Date {

    private static final int[] daysPerMonth = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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

    @Override
    public String toString() {
        return String.format("%d/%d/%d", day, month, year);
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
