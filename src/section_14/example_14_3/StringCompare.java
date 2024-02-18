package section_14.example_14_3;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = new String("witaj");
        String s2 = "do widzenia";
        String s3 = "Wszystkiego najlepszego";
        String s4 = "wszystkiego najlepszego";

        System.out.printf("s1 = %s\ns2 = %s\ns3 = %s\ns4 = %s\n", s1,s2,s3,s4);

        if(s1.equals("witaj")){
            System.out.println("s1 jest równe \"witaj\"");
        }else {
            System.out.println("s1 nie jest równe \"witaj\"");
        }

        if(s1 == "witaj"){
            System.out.println("s1 to ten sam obiekt co \"witaj\"");
        }else {
            System.out.println("s1 to nie ten sam obiekt co \"witaj\"");
        }

        if(s3.equalsIgnoreCase(s4)){
            System.out.printf("%s jest równe %s po zignorowaniu wielkości liter\n",s3,s4);
        }else {
            System.out.println("s3 nie jest równe s4");
        }

        System.out.printf("\ns1.compareTo(s2) jest %d", s1.compareTo(s2));
        System.out.printf("\ns2.compareTo(s1) jest %d", s2.compareTo(s1));
        System.out.printf("\ns1.compareTo(s1) jest %d", s1.compareTo(s1));
        System.out.printf("\ns3.compareTo(s4) jest %d", s3.compareTo(s4));
        System.out.printf("\ns4.compareTo(s3) jest %d\n", s4.compareTo(s3));

        if(s3.regionMatches(0,s4,0,5)){
            System.out.println("Pierwsze 5 znaków s3 i s4 jest sobie równe");
        }else {
            System.out.println("Pierwsze 5 znaków s3 i s4 nie jest sobie równe");
        }

        if(s3.regionMatches(true,0,s4,0,5)){
            System.out.println("Pierwsze 5 znaków s3 i s4 jest sobie równe po zignorowaniu wielkosci liter");
        }else {
            System.out.println("Pierwsze 5 znaków s3 i s4 nie jest sobie równe po zignorowaniu wielkosci liter");
        }
    }
}
