package section_5.t5_13;

public class Main {
    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
            System.out.printf("%2d silnia : %20d %n", i, power(i));
        }
    }

    public static long power(int number) {
        long result = 1;
        while (number > 0) {
            result = result * number;
            number--;
        }
        return result;
    }
}
