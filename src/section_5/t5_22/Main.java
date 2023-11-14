package section_5.t5_22;

public class Main {
    public static void main(String[] args) {
        int width=10;
        for (int i = 0; i < width; i++) {
            System.out.printf("%" + width + "s ","*".repeat(i+1));
            System.out.printf("%"+width+"s ","*".repeat(width-i));
            System.out.printf("%"+(width-i+1)+"s%s%n"," ".repeat(width-i+1),"*".repeat(i+1));
        }
    }
}
