package section_14.t_14_16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wpisz tekst : ");
            String text = scanner.nextLine();
            System.out.println("Wpisz litere : ");
            Character character = scanner.nextLine().charAt(0);
            System.out.printf("Pierwszy indeks znaku \"%c\" to %d%n",character, indexOf(text,character));
            System.out.printf("Ostatni indeks znaku \"%c\" to %d%n",character, lastIndexOf(text,character));

        }catch (Exception e){
            System.out.println("Bład podczas przetwarzania tekstu "+e.getMessage());
        }
    }

    public static int indexOf(String text, Character character){
        char[] characters = text.toCharArray();
        for(int i=0;i<characters.length;i++){
            if(characters[i]==character){
                return i;
            }
        }
        return -1;
    }

    public static int lastIndexOf(String text, Character character){
        char[] characters = text.toCharArray();
        for(int i=characters.length-1;i>=0;i--){
            if(characters[i]==character){
                return i;
            }
        }
        return -1;
    }
}
