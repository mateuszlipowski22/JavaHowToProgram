package section_8.t8_7;

public class Main {
    public static void main(String[] args) {
        Time2 time2 = new Time2(24,12,23);
        System.out.println(time2.toUniversalTime());

        time2.incrementMinute();
        System.out.println(time2.toUniversalTime());

        time2.incrementSecond();
        System.out.println(time2.toUniversalTime());

        time2.incrementHour();
        System.out.println(time2.toUniversalTime());
    }
}
