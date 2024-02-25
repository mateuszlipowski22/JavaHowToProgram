package section_14.example_14_17;

public class OtherCharMethods {
    public static void main(String[] args) {
        Character c1 = 'A';
        Character c2 = 'a';

        System.out.printf("c1 - %s%nc2 - %s%n", c1.charValue(),c2.toString());

        if(c1.equals(c2)){
            System.out.println("c1 i c2 sa równe");
        }else {
            System.out.println("c1 i c2 sa rózne");
        }
    }
}
