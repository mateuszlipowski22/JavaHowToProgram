package section_11.t11_17;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception exception) {
            System.err.printf("%s%n%n", exception.getMessage());
        }

        try {
            methodB();
        } catch (Exception exception) {
            System.err.printf("%s%n%n", exception.getMessage());
        }

        try {
            methodNullPointerException();
        } catch (Exception exception) {
            System.err.printf("%s%n%n", exception.getMessage());
        }

        try {
            methodIOException();
        } catch (Exception exception) {
            System.err.printf("%s%n%n", exception.getMessage());
        }
    }

    private static void methodIOException() throws IOException {
        throw new IOException("Wyjątek zgłoszony w metodzie methodIOException");

    }

    private static void methodNullPointerException() {
        throw new NullPointerException("Wyjątek zgłoszony w metodzie methodNullPointerException");
    }

    private static void methodA() throws ExceptionA {
        throw new ExceptionA("Wyjątek zgłoszony w metodzie methodA()");
    }

    private static void methodB() throws ExceptionB {
        throw new ExceptionB("Wyjątek zgłoszony w metodzie methodB()");
    }


}
