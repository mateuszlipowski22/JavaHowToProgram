package section_8.t8_15;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(12,29, 1998);
        Date date2= new Date(12, "styczeń", 2023);
        Date date3= new Date(222 ,2023);
        for (int i = 0; i < 20; i++) {
            date.nextDay();
            System.out.printf("%s%n", date.universalDate());
            System.out.printf("%s%n", date.textDate());
            System.out.printf("%s%n", date.totalDate());
            date2.nextDay();
            System.out.printf("%s%n", date2.universalDate());
            System.out.printf("%s%n", date2.textDate());
            System.out.printf("%s%n", date2.totalDate());
            date3.nextDay();
            System.out.printf("%s%n", date3.universalDate());
            System.out.printf("%s%n", date3.textDate());
            System.out.printf("%s%n", date3.totalDate());
            System.out.println();
        }
    }
}
