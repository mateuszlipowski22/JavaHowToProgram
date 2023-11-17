package section_6.t6_15;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.printf("Przeciwprostokątna trójkąto o bokach  %.2f i %.2f wynosi %.2f %n",
                    3.0, 4.0, hypotenuse(3.0,4.0));
            System.out.printf("Przeciwprostokątna trójkąto o bokach  %.2f i %.2f wynosi %.2f %n",
                    5.0, 12.0, hypotenuse(5.0,12.0));
            System.out.printf("Przeciwprostokątna trójkąto o bokach  %.2f i %.2f wynosi %.2f %n",
                    8.0, 15.0, hypotenuse(8.0,15.0));
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    public static double hypotenuse(double side1, double side2){
        return Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));
    }
}
