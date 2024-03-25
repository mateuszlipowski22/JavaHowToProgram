package org.programowanie_w_java.section_17.t_17_20;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wpisz uzyskane oceny oddzielone spacją");
            String gradesText = scanner.nextLine();

            System.out.printf("Oryginalne oceny : \"%s\"",gradesText);

            System.out.printf("Odwzorowane oceny : %n%s",
                    Arrays.stream(gradesText.split(" "))
                            .map(Double::parseDouble)
                            .map(grade->{
                                String result = "E";
                                if (grade > 90)
                                    result="A";
                                else if (grade > 75)
                                    result="B";
                                else if (grade > 50)
                                    result="C";
                                else if (grade > 25)
                                    result="D";
                                return String.format("%5.2f -> \"%s\"%n",grade,result);
                            })
                            .collect(Collectors.joining(""))
            );


        }catch (Exception e){
            System.err.println("Błąd podczas pobierania danych od użytkownika" +e.getMessage());
        }
    }
}
