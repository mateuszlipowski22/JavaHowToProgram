package org.programowanie_w_java.section_11.example_11_5;

public class UsingExceptions {

    public static void main(String[] args) throws Exception {
        try{
            throwException();
        }catch (Exception exception){
            System.err.println("Wyjątek obsłużony main");
        }
        doesNotThrowException();
    }


    public static void throwException() throws Exception {
        try{
            System.out.println("Metoda throwException()");
            throw new Exception();
        }catch (Exception exception){
            System.err.println("Obsługa wyjątku w metodzie throwException()");
            throw exception;
        }finally {
            System.err.println("Blok finally wykonany w metodzie throwException()");
        }
    }

    public static void doesNotThrowException() throws Exception {
        try{
            System.out.println("Metoda doesNotThrowException()");
        }catch (Exception exception){
            System.err.println(exception);
        }finally {
            System.err.println("Blok finally wykonany w metodzie doesNotThrowException()");
        }
    }
}
