package org.programowanie_w_java.section_11.example_11_7;

import java.util.Arrays;
import java.util.List;


public class UsingChainedExceptions {

    public static void main(String[] args) throws Exception {
        try {
            method1();
        } catch (Exception exception) {
            System.err.printf("%s%n%n", exception.getMessage());
            exception.printStackTrace();

            List<StackTraceElement> stackTraceElements = Arrays.asList(exception.getStackTrace());

            System.out.printf("%nZrzut stosu z getStackTrace:%n");
            System.out.println("Klasa\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPLik\t\t\t\t\tWiersz\tMetoda\t");
            stackTraceElements.forEach(element -> {
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t\t", element.getLineNumber());
                System.out.printf("%s%n", element.getMethodName());
            });

        }
    }


    public static void method1() throws Exception {
        try {
            method2();
        }catch (Exception exception) {
            throw new Exception("Wyjątek zgłoszony w metodzie method1()",exception);
        }
    }

    private static void method2() throws Exception {
        try {
            method3();
        }catch (Exception exception) {
            throw new Exception("Wyjątek zgłoszony w metodzie method2()",exception);
        }
    }

    private static void method3() throws Exception {
        throw new Exception("Wyjątek zgłoszony w metodzie method3()");
    }

}
