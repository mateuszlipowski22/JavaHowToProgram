package org.programowanie_w_java.section_16.e_16_8;

public class Time2 {
    private int second;

    public Time2() {
        this(0, 0, 0);
    }

    public Time2(int hour) {
        this(0, 0, hour);
    }

    public Time2(int hour, int minutes) {
        this(0, minutes, hour);
    }

    public Time2(int second, int minutes, int hour) {
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

    public Time2(Time2 time2) {
        this.second = time2.second;
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


    public String toUniversalTime(){
        return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
    }

    @Override
    public String toString() {
        return toUniversalTime();
    }
}