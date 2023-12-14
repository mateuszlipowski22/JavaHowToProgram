package section_8.t8_12;

public class Main {
    public static void main(String[] args) {
        DateAndTime today = new DateAndTime(12,14,2023,50,59,23);
        System.out.println("today = " + today);

        for (int i = 0; i < 50; i++) {
            today.incrementSecond();
            System.out.println("today = " + today);
        }
    }
}
