package inbuiltlambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
        Predicate<Integer> divby2 = iNo -> iNo % 2 == 0;
        Predicate<Integer> divBy3 = iNo -> iNo % 3 == 0;

        Predicate<Integer> divBy6 = divby2.and(divBy3);

        System.out.println(divBy6.test(21));
        System.out.println(divBy6.test(36));

        Consumer<Integer> con = System.out::println;
        con.accept(34);

        Consumer<String> rev = (str) -> {
            String sb = new StringBuilder(str).reverse().toString();
            System.out.println(sb);
        };

        rev.accept("Omkar");
        rev.accept("Sudhir");
        rev.accept("Mayuresh");

        Supplier<Double> supplier = () -> Math.random() * 100;
        System.out.println(supplier.get());

        Function<String, String> fn = (str) -> {
            return new StringBuilder(str).reverse().toString();
        };

        Function<String, Integer> strLen = String::length;



        System.out.println(fn.andThen(strLen).apply("Omkar"));


    }

}
