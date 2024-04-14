package section_21.e_21_9;

import java.util.NoSuchElementException;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(-1);
        stack.print();
        stack.push(0);
        stack.print();
        stack.push(1);
        stack.print();
        stack.push(5);
        stack.print();

        boolean continueLoop = true;

        while(continueLoop){
            try{
                int removedItem = stack.pop();
                System.out.printf("%nZdjęto %d%n", removedItem);
                stack.print();
            }catch (NoSuchElementException noSuchElementException){
                continueLoop=false;
                noSuchElementException.printStackTrace();
            }
        }

    }
}
