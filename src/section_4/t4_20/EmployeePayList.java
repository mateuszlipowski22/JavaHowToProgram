package section_4.t4_20;

public class EmployeePayList {

    private String name;
    private int weekHours;
    private double hourWage;

    public EmployeePayList(String name, int weekHours, double hourWage) {
        this.name = name;
        this.weekHours = weekHours;
        this.hourWage = hourWage;
    }

    public String getName() {
        return name;
    }

    public int getWeekHours() {
        return weekHours;
    }

    public double getHourWage() {
        return hourWage;
    }
}
