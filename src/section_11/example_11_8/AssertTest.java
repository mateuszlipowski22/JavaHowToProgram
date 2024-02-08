package org.programowanie_w_java.section_11.example_11_8;

import java.util.Scanner;

public class AssertTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Wpisz liczbę z przedziału od 0 do 10: ");

        int number = input.nextInt();

        assert (number>=0 && number<=10) : "błędna liczba "+number;

        System.out.printf("Wpisałeś %d%n",number);
    }
}
