package section_20.e_20_7;

import java.util.NoSuchElementException;

public class StackTest {
    public static void main(String[] args) {
        double[] doubleElements = {1.1,2.2,3.3,4.4,5.5};
        int[] integerElements = {1,2,3,4,5,6,7,8,9,10};

        Stack<Double> doubleStack = new Stack<>(5);
        Stack<Integer> integerStack = new Stack<>(5);

        testPushDouble(doubleStack,doubleElements);
        testPopDouble(doubleStack);

        testPushInteger(integerStack,integerElements);
        testPopInteger(integerStack);
    }

    private static void testPopInteger(Stack<Integer> integerStack) {
        try{
            System.out.printf("%nZdejmowanie elementów z doubleStack%n");
            int popValue;

            while(true){
                popValue= integerStack.pop();
                System.out.printf("%d ",popValue);
            }
        }catch (NoSuchElementException noSuchElementException){
            System.err.println();
            noSuchElementException.printStackTrace();
        }
    }

    private static void testPushInteger(Stack<Integer> integerStack, int[] integerElements) {
        System.out.printf("%nUmieszczanie elemetów w doubleStacku%n");

        for(int value : integerElements){
            System.out.printf("%d ",value);
            integerStack.push(value);
        }
    }

    private static void testPopDouble(Stack<Double> doubleStack) {
        try{
            System.out.printf("%nZdejmowanie elementów z doubleStack%n");
            double popValue;

            while(true){
                popValue= doubleStack.pop();
                System.out.printf("%.1f ",popValue);
            }
        }catch (NoSuchElementException noSuchElementException){
            System.err.println();
            noSuchElementException.printStackTrace();
        }
    }

    private static void testPushDouble(Stack<Double> stack, double[] values){
        System.out.printf("%nUmieszczanie elemetów w doubleStacku%n");

        for(double value : values){
            System.out.printf("%.1f ",value);
            stack.push(value);
        }
    }
}
