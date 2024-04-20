package section_21.t_21_12;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class InfixToPostfixConverter {

    private final Map<Character, Integer> orderWeight = new HashMap<>() {{
        put('+', 1);
        put('-', 1);
        put('*', 2);
        put('/', 2);
        put('%', 2);
        put('^', 3);
    }};


    private final StringBuffer postfix = new StringBuffer();
    private StringBuffer infix;

    public StringBuffer convertToPostfix(String input) {
        this.infix = new StringBuffer(input);
        infix.append(')');

        Stack<Character> characterStack = new Stack<>();
        characterStack.push('(');

        if (!characterStack.isEmpty()) {
            for (int i = 0; i < infix.length(); i++) {
                Character currentCharacter = infix.charAt(i);
                if (Character.isDigit(currentCharacter)) {
                    postfix.append(currentCharacter);
                } else if (currentCharacter.equals('(')) {
                    characterStack.push('(');
                } else if (isOperand(currentCharacter)) {
                    Character operandFromStack = characterStack.peek();
                    while (isOperand(operandFromStack) && precedent(currentCharacter, operandFromStack)) {
                        operandFromStack = characterStack.pop();
                        postfix.append(operandFromStack);
                        operandFromStack = characterStack.peek();
                    }
                    characterStack.push(currentCharacter);
                } else if (currentCharacter.equals(')')) {
                    Character operandFromStack = characterStack.peek();
                    while (!operandFromStack.equals('(')) {
                        postfix.append(characterStack.pop());
                        operandFromStack = characterStack.peek();
                    }
                    characterStack.pop();
                }
            }
        }
        return postfix;
    }

    private boolean precedent(Character operand1, Character operand2) {
        return orderWeight.get(operand1)<orderWeight.get(operand2);
    }

    public boolean isOperand(Character c) {
        return (
                c.equals('+') ||
                        c.equals('-') ||
                        c.equals('*') ||
                        c.equals('/') ||
                        c.equals('^') ||
                        c.equals('%')
        );
    }
}
