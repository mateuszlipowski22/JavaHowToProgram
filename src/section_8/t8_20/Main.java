package section_8.t8_20;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date birth = new Date(1945, Calendar.MARCH,12);
        Date hire = new Date(1988, Calendar.APRIL,24);

        Employee employee = new Employee("Jan", "Nowak", birth, hire);

        System.out.println(employee);
    }
}
