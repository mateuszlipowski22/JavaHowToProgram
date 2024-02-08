package section_11.t11_18;

import section_11.t11_17.ExceptionA;

public class Main {
    public static void main(String[] args) {
        try {
            methodA();
//        } catch (Exception exception) {
//            System.err.printf("%s%n%n", exception.getMessage());
        } catch (ExceptionA exception) {
            System.err.printf("%s%n%n - podklasa", exception.getMessage());
        } catch (Exception exception) {
            System.err.printf("%s%n%n", exception.getMessage());
        }
    }

    private static void methodA() throws ExceptionA {
        throw new ExceptionA("Wyjątek zgłoszony w metodzie methodA()");
    }
}
