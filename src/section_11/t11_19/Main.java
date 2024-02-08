package section_11.t11_19;

public class Main {
    public static void main(String[] args) {
        try {
            SomeClass someClass1 = new SomeClass(false);
            SomeClass someClass2 = new SomeClass(true);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
