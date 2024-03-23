package section_17.t_17_12;

// Invoice.java
public class Invoice {
   private final String partNumber; 
   private final String partDescription;
   private int quantity;
   private double pricePerItem;

   // Konstruktor.
   public Invoice(String partNumber, String partDescription, int quantity,
      double pricePerItem) {
      if (quantity < 0) { // Walidacja liczby sztuk.
         throw new IllegalArgumentException("Liczba sztuk musi być >= 0");
      }

      if (pricePerItem < 0.0) { // Walidacja ceny za sztukę.
         throw new IllegalArgumentException("Cena za sztukę musi być >= 0");
      }

      this.quantity = quantity;
      this.partNumber = partNumber;
      this.partDescription = partDescription;
      this.pricePerItem = pricePerItem;
   } 

   // Pobierz numer części.
   public String getPartNumber() {return partNumber;} 

   // Pobierz opis.
   public String getPartDescription() {return partDescription;} 

   // UStaw liczbę sztuk.
   public void setQuantity(int quantity) {
      if (quantity < 0) { // Walidacja liczby sztuk.
         throw new IllegalArgumentException("Liczba sztuk musi być >= 0");
      }

      this.quantity = quantity;
   } 

   // Pobierz liczbę sztuk.
   public int getQuantity() {return quantity;}

   // Ustaw cenę za sztukę.
   public void setPricePerItem(double pricePerItem) {
      if (pricePerItem < 0.0) {// Walidacja ceny za sztukę.
         throw new IllegalArgumentException("Cena za sztukę musi być >= 0");
      }

      this.pricePerItem = pricePerItem;
   } 

   // Pobierz cenę za sztukę.
   public double getPricePerItem() {return pricePerItem;} 

   // Zwraca tekstową reprezentację obiektu Invoice.
   @Override
   public String toString() {
      return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f", 
         "Faktura", "Numer części", getPartNumber(), getPartDescription(), 
         "sztuk", getQuantity(), "cena za sztukę", getPricePerItem());
   } 

   // Zwróć kwotę na fakturze.
   public double getInvoiceAmount() {                                                                   
      return getQuantity() * getPricePerItem(); // Oblicz łączny koszt.
   } 
}



/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
