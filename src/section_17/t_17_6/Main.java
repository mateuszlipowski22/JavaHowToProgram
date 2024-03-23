package section_17.t_17_6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<Integer> lambda = (Integer a, Integer b)->a*b;
        System.out.println("lambda.apply(1,2) = " + lambda.apply(1, 2));

        BinaryOperator<Integer> lambda2 = (a,b)->a*b;
        System.out.println("lambda2.apply(1,2) = " + lambda2.apply(1, 2));

        Supplier<String> lambda3 = ()->"witamy w lambdach";
        System.out.println("lambda3.get() = " + lambda3.get());

        Supplier<List> lambda4 = ArrayList::new;
        System.out.println("lambda4.get" + lambda4.get());
    }
}
