package section_4.t4_20;

public class EmployeeWageCalculator implements WageCalculator{
    @Override
    public double calculateWage(EmployeePayList employeePayList) {
        return employeePayList.getWeekHours()>40 ?
                (employeePayList.getWeekHours()-40)*(employeePayList.getHourWage()*1.5)
                        +(employeePayList.getWeekHours())*(employeePayList.getHourWage()) :
                (employeePayList.getWeekHours())*(employeePayList.getHourWage());
    }
}
