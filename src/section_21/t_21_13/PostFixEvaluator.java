package section_21.t_21_13;

import section_21.t_21_12.Stack;

public class PostFixEvaluator {
    private StringBuffer postfix;

    public Double evaluatePostfixExpression(String input) {
        this.postfix = new StringBuffer(input);
        postfix.append(')');

        Stack<Double> numbers = new Stack<>();

        int index=0;
        Character currentCharacter=Character.valueOf(postfix.charAt(index));

        while(!currentCharacter.equals(')')){
            if(Character.isDigit(currentCharacter)){
                numbers.push(Double.valueOf(currentCharacter-48));
            }else {
                numbers.push(calculate(numbers.pop(), currentCharacter, numbers.pop()));
            }
            currentCharacter=Character.valueOf(postfix.charAt(index++));
        }

        return numbers.pop();
    }

    private double calculate(double operand2, char operator, double operand1){
        return switch (operator) {
            case '+' -> operand1+operand2;
            case '-' -> operand1-operand2;
            case '*' -> operand1*operand2;
            case '/' -> operand1/operand2;
            case '^' -> Math.pow(operand2,operand1);
            case '%' -> operand1%operand2;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }
}
