package section_5.t5_17;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int number = 0;
            int quantity;

            Map<String, Double> totalCost = new HashMap<>();

            while (number != -1) {
                System.out.println("Wprowadz numer produktu : ");
                number = scanner.nextInt();
                if (number != -1) {
                    System.out.println("Wprowadz liczbe produktów");
                    quantity = scanner.nextInt();
                    if(totalCost.containsKey(String.valueOf(number))){
                        totalCost.put(String.valueOf(number), totalCost.get(String.valueOf(number))+getTotalProductPrice(number,quantity));
                    }else {
                        totalCost.put(String.valueOf(number), getTotalProductPrice(number,quantity));
                    }
                }
            }

            totalCost.forEach((k,v)-> System.out.printf("Produkt numer %s : %.2f %n",k,v));

            System.out.printf("Koszt całkowity : %.2f", totalCost.values().stream().mapToDouble(Double::doubleValue).sum());
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static double getTotalProductPrice(int productNumber, int quantity) {
        double price = switch (quantity) {
            case 1 -> 2.98;
            case 2 -> 4.50;
            case 3 -> 9.98;
            case 4 -> 4.49;
            case 5 -> 6.87;
            default -> 0;
        };
        return price*quantity;
    }
}
