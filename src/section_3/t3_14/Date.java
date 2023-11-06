package section_3.t3_14;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if (year > 0) {
            this.year = year;
        }
        this.setMonth(month);
        this.setDay(day);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 0 && day <= 31) {
            switch (this.month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    this.day = day;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day <= 30) {
                        this.day = day;
                    }
                    break;
                case 2:
                    if (this.year % 4 == 0 && day <= 29) {
                        this.day = day;
                    } else if (day <= 28) {
                        this.day = day;
                    }else {
                        this.day = -1;
                    }
                    break;
                default:
                    this.day = -1;
            }
        } else {
            this.day = -1;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        } else {
            this.month = -1;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate() {
        System.out.printf("%d - %d - %d %n", getDay(), getMonth(), getYear());
    }
}
