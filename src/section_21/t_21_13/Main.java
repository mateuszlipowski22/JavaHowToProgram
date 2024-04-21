package section_21.t_21_13;

import section_21.t_21_12.InfixToPostfixConverter;

public class Main {
    public static void main(String[] args) {
        PostFixEvaluator postFixEvaluator = new PostFixEvaluator();

        String input = "62+5*84/-";

        System.out.println(input);
        System.out.println(postFixEvaluator.evaluatePostfixExpression(input));

    }
}
