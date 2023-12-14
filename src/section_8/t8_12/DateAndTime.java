package section_8.t8_12;

public class DateAndTime {

    private static final int[] daysPerMonth = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int second;
    private int month;
    private int day;
    private int year;

    public DateAndTime(int month, int day, int year, int second, int minutes, int hour) {
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException(String.format("day (%d) musi znajdowac się w zakresie 1-12", month));
        }

        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException(String.format("day (%d) poza zakresem dla dla danego miesiaca i roku", day));
        }

        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException(String.format("year (%d) poza zakresem dla dla danego miesiaca i roku", year));
        }

        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("Niepoprawna godzina");
        }
        if (minutes < 0 || minutes >= 60) {
            throw new IllegalArgumentException("Niepoprawne minuty");
        }
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("Niepoprawne sekundy");
        }

        this.second = second + minutes * 60 + hour * 60 * 60;

        this.month = month;
        this.day = day;
        this.year = year;
    }

    public DateAndTime() {
        this(1, 1, 2023, 0, 0, 0);
    }

    public DateAndTime(int month, int day, int year, int hour) {
        this(month, day, year, 0, 0, hour);
    }

    public DateAndTime(int month, int day, int year, int hour, int minutes) {
        this(month, day, year, 0, minutes, hour);
    }

    public DateAndTime(DateAndTime dateAndTime) {
        this.month = dateAndTime.month;
        this.day = dateAndTime.day;
        this.year = dateAndTime.year;
        this.second = dateAndTime.second;
    }

    public void setTime(int second, int minutes, int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("Niepoprawna godzina");
        }
        if (minutes < 0 || minutes >= 60) {
            throw new IllegalArgumentException("Niepoprawne minuty");
        }
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("Niepoprawne sekundy");
        }

        this.second = second + minutes * 60 + hour * 60 * 60;
    }

    public void setHour(int hour) {
        this.second = this.second % (60 * 60) + hour * 60 * 60;
    }

    public void setMinute(int minute) {
        this.second = this.second / (60 * 60) + minute * 60 + (this.second % (60 * 60)) % 60;
    }

    public void setSecond(int second) {
        this.second = this.second / (60 * 60) + (this.second % (60 * 60)) % 60 + second;
    }

    public int getHour() {
        return this.second / (60 * 60);
    }

    public int getMinute() {
        return this.second % (60 * 60)/60;
    }

    public int getSecond() {
        return (this.second % (60 * 60)) % 60;
    }

    public void incrementSecond(){
        if(second<86399){
            second++;
        }else {
            second=0;
            nextDay();
        }
    }
    public void incrementMinute(){
        for (int i = 0; i < 60; i++) {
            incrementSecond();
        }
    }

    public void incrementHour(){
        for (int i = 0; i < 60; i++) {
            incrementMinute();
        }
    }

    public String toUniversalDate(){
        return String.format("%02d:%02d:%02d %d/%d/%d",getHour(),getMinute(),getSecond(), day, month, year);
    }

    @Override
    public String toString() {
        return this.toUniversalDate();
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
