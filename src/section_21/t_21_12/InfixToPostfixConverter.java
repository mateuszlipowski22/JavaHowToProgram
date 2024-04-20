package section_21.t_21_12;

public class InfixToPostfixConverter {

//    public StringBuffer convertToPostfix(StringBuffer infix) {
//
//    }

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
