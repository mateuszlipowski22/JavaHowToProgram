package section_11.t11_16;

public class Main {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (ExceptionA exception) {
            System.err.printf("%s%n%n", exception.getMessage());
        }

        try {
            methodB();
        } catch (ExceptionA exception) {
            System.err.printf("%s%n%n", exception.getMessage());
        }

        try {
            methodC();
        } catch (ExceptionA exception) {
            System.err.printf("%s%n%n", exception.getMessage());
        }
    }

    private static void methodA() throws ExceptionA {
        throw new ExceptionA("Wyjątek zgłoszony w metodzie methodA()");
    }

    private static void methodB() throws ExceptionB {
        throw new ExceptionB("Wyjątek zgłoszony w metodzie methodB()");
    }

    private static void methodC() throws ExceptionC {
        throw new ExceptionC("Wyjątek zgłoszony w metodzie methodC()");
    }

}
