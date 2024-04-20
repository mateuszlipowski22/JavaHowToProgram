package section_21.t_21_12;

public class Main {
    public static void main(String[] args) {
        InfixToPostfixConverter infixToPostfixConverter = new InfixToPostfixConverter();

        String input = "(6+2)*5-8/4";

        System.out.println(input);
        System.out.println(infixToPostfixConverter.convertToPostfix(input));

    }
}
