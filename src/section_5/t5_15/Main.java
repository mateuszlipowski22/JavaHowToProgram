package section_5.t5_15;

public class Main {
    public static void main(String[] args) {
        int width=10;
        for (int i = 0; i < width; i++) {
            System.out.printf("%s%n","*".repeat(i+1));
        }
        System.out.println();
        for (int i = 0; i < width; i++) {
            System.out.printf("%s%n","*".repeat(width-i));
        }

        System.out.println();
        for (int i = 1; i < width; i++) {
            System.out.printf("%s%s%n"," ".repeat(width-i),"*".repeat(i));
        }
    }
}
