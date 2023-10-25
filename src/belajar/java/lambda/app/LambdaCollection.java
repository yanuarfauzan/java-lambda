package belajar.java.lambda.app;

import java.util.List;
import java.util.function.Consumer;

public class LambdaCollection {
    // foreach di iterable interface (Iterable.ForEach)
    public static void main(String[] args) {
        List<String> list = List.of("Yanuar", "Fauzan", "Isnain");

        for (var value : list) {
            System.out.println(value);
        }

        // ForEach Anonymous Class
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        System.out.println("lambda");
        System.out.println(" ");
        // ForEach Lambda Expression
        list.forEach(value -> System.out.println(value));

        System.out.println("method reference");
        System.out.println(" ");
        // ForEach Lambda Expression with Method Reference
        list.forEach(System.out::println);
    }

}
