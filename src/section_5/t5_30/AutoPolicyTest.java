package section_5.t5_30;

public class AutoPolicyTest {
    public static void main(String[] args) {
        try {
            AutoPolicy autoPolicy1 = new AutoPolicy(1111, "Toyota Camry", "New York");
            AutoPolicy autoPolicy2 = new AutoPolicy(2222, "Ford Fusion", "Vermont");
            policyInNoFaultState(autoPolicy1);
            System.out.println();
            policyInNoFaultState(autoPolicy2);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void policyInNoFaultState(AutoPolicy autoPolicy){
        System.out.println("Ubezpieczenie samochodu:");
        System.out.printf("Polisa numer : %d%nAuto : %s%nStan %s %s stanem stosującym no-foult %n",
                autoPolicy.getAccountNumber(),
                autoPolicy.getMakeAndModel(),
                autoPolicy.getState(),
                (autoPolicy.inNoFaultState())?"jest":"nie jest");
    }

}
