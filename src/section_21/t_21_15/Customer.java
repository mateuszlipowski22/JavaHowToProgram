package section_21.t_21_15;

public class Customer {

    public static int currentNumber = 0;
    private final int customerNumber;
    private final int processTime;

    public Customer(int processTime) {
        this.customerNumber = ++currentNumber;
        this.processTime = processTime;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public int getProcessTime() {
        return processTime;
    }

    @Override
    public String toString() {
        return String.format("Klient %d : %d",customerNumber,processTime);
    }
}
