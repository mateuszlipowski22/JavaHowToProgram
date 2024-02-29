package section_14.example_14_20;

public class ValidateInput {
    public static boolean validateFirstName(String firstName){
        return firstName.matches("[A-Z][a-zA-Z]*]");
    }

    public static boolean validateLastName(String lastName){
        return lastName.matches("[A-Za-z]+(['-][a-zA-Z]+)*]");
    }

    public static boolean validateAddress(String address){
        return address.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)\\s+\\d+");
    }

    public static boolean validateCity(String city){
        return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    public static boolean validateState(String state){
        return state.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    public static boolean validateZip(String zip){
        return zip.matches("\\d{2}-\\d{3}");
    }

    public static boolean validatePhone(String phone){
        return phone.matches("[1-9]\\d{2}-\\d{3}-\\d{3}");
    }
}
