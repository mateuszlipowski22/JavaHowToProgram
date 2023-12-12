package section_8.t8_8;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(12,29, 1998);
        for (int i = 0; i < 365; i++) {
            date.nextDay();
            System.out.printf("%s%n", date);
        }
    }
}
