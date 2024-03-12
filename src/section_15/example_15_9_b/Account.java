package section_15.example_15_9_b;

// Rysunek 15.9. Account.java
// Klasa Account do przechowywania rekordów jako obiektów
public class Account {
   private int accountNumber;
   private String firstName;
   private String lastName;
   private double balance;
   
   // Inicjalizuj obiekt wartościami domyślnymi
   public Account() {this(0, "", "", 0.0);} 
  
   // Inicjalizuj obiekt przekazanymi wartościami
   public Account(int accountNumber, String firstName, 
      String lastName, double balance) {
      this.accountNumber = accountNumber;
      this.firstName = firstName;
      this.lastName = lastName;
      this.balance = balance;
   }

   // Pobierz numer konta
   public int getAccountNumber() {return accountNumber;} 
   
   // Ustaw numer konta
   public void setAccountNumber(int accountNumber) 
      {this.accountNumber = accountNumber;}

   // Pobierz imię
   public String getFirstName() {return firstName;} 
   
   // Ustaw imię
   public void setFirstName(String firstName) 
      {this.firstName = firstName;} 

   // Pobierz nazwisko
   public String getLastName() {return lastName;} 
   
   // Ustaw nazwisko
   public void setLastName(String lastName) {this.lastName = lastName;} 

   // Pobierz saldo
   public double getBalance() {return balance;} 

   // Ustaw saldo
   public void setBalance(double balance) {this.balance = balance;} 
} 


/*************************************************************************
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