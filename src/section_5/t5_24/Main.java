package section_5.t5_24;

public class Main {
    public static void main(String[] args) {
        int width=10;
        for (int i = 0; i < 2*width-1; i++) {
            if(i<width){
                System.out.printf("%s%s%n",
                        " ".repeat(width-1-i),
                        "*".repeat(1+2*i));
            }else {
                System.out.printf("%s%s%n",
                        " ".repeat(i-width+1),
                        "*".repeat(2*width-3-2*(i-width)));
            }
        }
    }
}
