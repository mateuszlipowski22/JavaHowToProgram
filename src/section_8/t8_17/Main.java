package section_8.t8_17;

public class Main {
    public static void main(String[] args) {
        HugeInteger hugeInteger = new HugeInteger("123457");
        HugeInteger hugeInteger2 = new HugeInteger("123457");
        System.out.printf("hugeInteger  = %7s%n", hugeInteger);
        System.out.printf("hugeInteger2 = %7s%n", hugeInteger2);
//        hugeInteger.subtract(hugeInteger2);
        System.out.printf("hugeInteger  = %7s%n", hugeInteger);
        System.out.println("hugeInteger.isEqualTo(hugeInteger2) = " + hugeInteger.isEqualTo(hugeInteger2));
        System.out.println("hugeInteger.isNotEqualTo(hugeInteger2) = " + hugeInteger.isNotEqualTo(hugeInteger2));
        System.out.println("hugeInteger2.isGreaterThan(hugeInteger)) = " + hugeInteger2.isGreaterThan(hugeInteger));
        System.out.println("hugeInteger2.isLesserThan(hugeInteger) = " + hugeInteger2.isLesserThan(hugeInteger));
        System.out.println("hugeInteger2.isGreaterThanOrEqual(hugeInteger)) = " + hugeInteger2.isGreaterThanOrEqual(hugeInteger));
        System.out.println("hugeInteger2.isLesserThanOrEqual(hugeInteger)) = " + hugeInteger2.isLesserThanOrEqual(hugeInteger));
    }
}
