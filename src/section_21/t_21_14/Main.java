package section_21.t_21_14;

public class Main {
    public static void main(String[] args) {
        PostFixEvaluator postFixEvaluator = new PostFixEvaluator();

        String input = "6022 222 +";

        System.out.println(input);
        System.out.println(postFixEvaluator.evaluatePostfixExpression(input));

    }
}
