package section_11.t11_16;

public class Main {
    public static void main(String[] args) {
        try {
//            methodA();
//            methodB();
            methodC();
        } catch (ExceptionA exception) {
            System.err.printf("%s%n%n", exception.getMessage());
        }
    }

    private static void methodA() throws ExceptionA {
        throw new ExceptionC("Wyjątek zgłoszony w metodzie methodA()");
    }

    private static void methodB() throws ExceptionA {
        throw new ExceptionC("Wyjątek zgłoszony w metodzie methodB()");
    }

    private static void methodC() throws ExceptionA {
        throw new ExceptionC("Wyjątek zgłoszony w metodzie methodC()");
    }

}
