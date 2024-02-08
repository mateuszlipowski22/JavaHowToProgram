package section_11.t11_19;

public class SomeClass {
    public SomeClass(boolean isException) throws Exception {
        if(isException){
            throw new Exception("Błąd podczas tworzenia nowej instancji SomeClass");
        }
    }
}
