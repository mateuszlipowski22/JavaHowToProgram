package section_15.example_15_9_b;// Rysunek 15.11. CreateSequentialFile.java
// Zapisyanie obiektów w pliku za pomocą JAXB i BufferedWriter
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.xml.bind.JAXB;

public class CreateSequentialFile {
   public static void main(String[] args) {
      // Otwiera clients.xml, zapisuje obiekty i zamyka plik
      try(BufferedWriter output = 
         Files.newBufferedWriter(Paths.get("clientsz.xml"))) {
         
         Scanner input = new Scanner(System.in);

         // Przechowuje Accounts przed serializacją XML
         Accounts accounts = new Accounts(); 

         System.out.printf("%s%n%s%n? ", 
            "Wpisz numer konta, imię, nazwisko i saldo.",
            "Wpisz wskaźnik końca danych, aby zakończyć.");

         while (input.hasNext()) { // Bądź w pętli aż do wskaźnika końca danych
            try {
               // Utwórz nowy rekord
               Account record = new Account(input.nextInt(),
                  input.next(), input.next(), input.nextDouble());

               // Dodaj do AccountList
               accounts.getAccounts().add(record);
            } 
            catch (NoSuchElementException elementException) {
               System.err.println("Niepoprawne dane. Spróbuj ponownie.");
               input.nextLine(); // Pomiń dane, aby użytkownik mógł spróbować ponownie
            } 

            System.out.print("? ");
         }

         // Zapisz obiekt AccountList jako XML
         JAXB.marshal(accounts, output); 
      }
      catch (IOException ioException) {
         System.err.println("Błąd otwarcia pliku. Kończę działanie.");
      } 
   } 
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