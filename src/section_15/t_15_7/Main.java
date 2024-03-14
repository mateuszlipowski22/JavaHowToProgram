package section_15.t_15_7;

public class Main {
    public static void main(String[] args) {
        PhoneNumberConverter phoneNumberConverter = new PhoneNumberConverter();

//        phoneNumberConverter.getWordList("686-37-54").forEach(System.out::println);
        phoneNumberConverter.getWordList("686-37-54").stream().filter(word -> word.equals("NUMERKI")).forEach(System.out::println);
    }
}
