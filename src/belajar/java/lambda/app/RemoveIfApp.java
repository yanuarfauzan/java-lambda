package belajar.java.lambda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// menghapus list item jika panjang nya lebih dari lima karakter
public class RemoveIfApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.addAll(List.of("Eko", "Fauzan", "Isnain"));

        // Remove if anonymous class
        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.length() > 5;
            }
        });

        // lambda
        list.removeIf(lst -> lst.length() > 5);
        
        System.out.println(list);
        // list.forEach(System.out::println);
    }
}
