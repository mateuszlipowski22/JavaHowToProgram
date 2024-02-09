package section_11.t11_20;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            someMethod1();
        } catch (Exception exception) {
            System.err.printf("%s%n%n", exception.getMessage());
            exception.printStackTrace();

            List<StackTraceElement> stackTraceElements = Arrays.asList(exception.getStackTrace());

            System.out.printf("%nZrzut stosu z getStackTrace:%n");
            System.out.printf("%-40s %-20s %-10s %-20s%n", "Klasa", "Plik","Wiersz","Metoda" );
            stackTraceElements.forEach(element -> {
                System.out.printf("%-40s ", element.getClassName());
                System.out.printf("%-20s ", element.getFileName());
                System.out.printf("%-10s ", element.getLineNumber());
                System.out.printf("%-20s%n", element.getMethodName());
            });

        }
    }


    public static void someMethod1() throws Exception {
        try {
            someMethod2();
        }catch (Exception exception) {
            throw exception;
        }
    }

    private static void someMethod2() throws Exception {
        throw new Exception("Wyjątek zgłoszony w metodzie someMethod2()");
    }
}
