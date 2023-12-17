package section_8.t8_14;

public class Main {
    public static void main(String[] args) {
        IntegerSet integerSet = new IntegerSet(10);
        integerSet.insertElement(2);
        integerSet.insertElement(22);
        System.out.println("integerSet.getNumber() = " + integerSet);

        IntegerSet integerSet2 = new IntegerSet(30);
        integerSet2.insertElement(2);
        integerSet2.insertElement(33);
        System.out.println("integerSet2.getNumber() = " + integerSet2);

        System.out.println("IntegerSet.union(integerSet,integerSet2) = " + IntegerSet.union(integerSet, integerSet2));
        System.out.println("IntegerSet.intersection(integerSet,integerSet2) = " + IntegerSet.intersection(integerSet, integerSet2));
        System.out.println("IntegerSet.isEqual(integerSet,integerSet2) = " + IntegerSet.isEqual(integerSet, integerSet2));

    }
}
