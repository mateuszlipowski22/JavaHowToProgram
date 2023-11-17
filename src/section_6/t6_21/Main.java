package section_6.t6_21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadz liczbe :");
            int number = scanner.nextInt();

            separateDigits(number);

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    private static void separateDigits(int number){
//        int temp=number;
//        StringBuilder sb = new StringBuilder();
//        while (temp>0){
//            sb.append(" ").append(temp % 10).append(" ");
//            temp=temp/10;
//        }
//        System.out.println(sb.reverse());
        System.out.println(String.valueOf(number).replace("","  ").trim());
    }
}
