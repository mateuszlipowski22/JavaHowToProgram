package section_21.t_21_14;

import section_21.t_21_12.Stack;

public class PostFixEvaluator {
    private StringBuffer postfix;

    public Double evaluatePostfixExpression(String input) {
        this.postfix = new StringBuffer(input);
        postfix.append(')');

        Stack<Double> numbers = new Stack<>();

        int index=0;
        Character currentCharacter=Character.valueOf(postfix.charAt(index));
        StringBuilder currentNumber=new StringBuilder();

        while(!currentCharacter.equals(')')){
            System.out.println(currentNumber.toString());
            if(Character.isDigit(currentCharacter)){
//                currentNumber.append(Long.valueOf(currentCharacter-48));
                currentNumber.append(currentCharacter);
            }else if(currentCharacter.equals(' ')){
                numbers.push(Double.parseDouble(currentNumber.toString()));
                currentNumber=new StringBuilder();
            } else {
                numbers.push(calculate(numbers.pop(), currentCharacter, numbers.pop()));
            }
            currentCharacter=Character.valueOf(postfix.charAt(++index));
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
