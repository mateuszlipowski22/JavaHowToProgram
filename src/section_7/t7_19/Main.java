package section_7.t7_19;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            boolean[] seats = new boolean[11];
            int nextEconomic = 1;
            int nextBusiness = 6;
            Scanner scanner = new Scanner(System.in);

            int booking;
            boolean con = true;
            while (con) {
                int currentSeat=0;
                System.out.println("Wpisz 1 dla klasy ekonomiczne");
                System.out.println("Wpisz 2 dla klasy biznesowej");
                System.out.println("Wpisz 0 dla wyjscia");

                booking = scanner.nextInt();

                if (booking == 0) {
                    con = false;
                } else {
                    if (booking == 1) {
                        if (nextEconomic != 6) {
                            seats[nextEconomic] = true;
                            currentSeat=nextEconomic;
                            nextEconomic++;
                        } else {
                            System.out.println("Bilety klasy ekonomicznej sa zajete");
                            System.out.println("Wpisz 2 dla klasy biznesowej");
                            booking = scanner.nextInt();
                            if (booking == 2) {
                                if (nextBusiness != 11) {
                                    seats[nextBusiness] = true;
                                    currentSeat=nextBusiness;
                                    nextBusiness++;
                                } else {
                                    System.out.println("Bilety klasy ekonomicznej i biznesowej sa juz zajęte");
                                }
                            }
                        }
                    } else if (booking == 2) {
                        if (nextBusiness != 11) {
                            seats[nextBusiness] = true;
                            currentSeat=nextBusiness;
                            nextBusiness++;
                        } else {
                            System.out.println("Bilety klasy biznesowe sa zajete");
                            System.out.println("Wpisz 1 dla klasy biznesowej");
                            booking = scanner.nextInt();
                            if (booking == 1) {
                                if (nextEconomic != 6) {
                                    seats[nextEconomic] = true;
                                    currentSeat=nextEconomic;
                                    nextEconomic++;
                                } else {
                                    System.out.println("Bilety klasy ekonomicznej i biznesowej sa juz zajęte");
                                }
                            }
                        }
                    }
                }
                if(currentSeat!=0){
                    System.out.printf("Miejsce numer %d : klasa %s %n", currentSeat, currentSeat>=6?"biznesowa":"ekonomiczna");
                }
            }

            System.out.println("Zakonczenie rezerwacji / Wszystkie bilety sprzedane");

        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
