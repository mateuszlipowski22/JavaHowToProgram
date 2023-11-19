package section_6.t6_34;

public class Main {
    public static void main(String[] args) {
        int number=256;
        for (int i = 1; i < number; i++) {
            System.out.printf("%3d : %9s : %8s : %8s %n"
                    ,i,Integer.toBinaryString(i),Integer.toOctalString(i),Integer.toHexString(i));
        }
    }
}
