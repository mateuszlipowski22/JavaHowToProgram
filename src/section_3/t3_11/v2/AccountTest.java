package section_3.t3_11.v2;

public class AccountTest {
    public static void main(String[] args) {

        Account account1 = new Account("Jan Nowak");
        Account account2 = new Account("Marej Kowlaski");

        System.out.printf("Imie i  nazwisko w obiekcie account1 to %s%n%n", account1.getName());
        System.out.printf("Imie i  nazwisko w obiekcie account2 to %s%n%n", account2.getName());
    }
}
