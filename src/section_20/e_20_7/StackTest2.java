package section_20.e_20_7;

import java.util.NoSuchElementException;

public class StackTest2 {
    public static void main(String[] args) {
        Double[] doubleElements = {1.1,2.2,3.3,4.4,5.5};
        Integer[] integerElements = {1,2,3,4,5,6,7,8,9,10};

        Stack<Double> doubleStack = new Stack<>(5);
        Stack<Integer> integerStack = new Stack<>(5);

        testPush("doubleStack", doubleStack,doubleElements);
        testPop("doubleStack", doubleStack);

        testPush("integerStack",integerStack,integerElements);
        testPop("integerStack", integerStack);
    }

    private static <T> void testPop(String name,Stack<T> stack) {
        try{
            System.out.printf("%nZdejmowanie elementów z %s%n",name);
            T popValue;

            while(true){
                popValue= stack.pop();
                System.out.printf("%s ",popValue);
            }
        }catch (NoSuchElementException noSuchElementException){
            System.err.println();
            noSuchElementException.printStackTrace();
        }
    }

    private static <E> void testPush(String name, Stack<E> stack, E[] elements) {
        System.out.printf("%nUmieszczanie elemetów w %s%n",name);

        for(E value : elements){
            System.out.printf("%s ",value);
            stack.push(value);
        }
    }
}
