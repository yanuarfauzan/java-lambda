package belajar.java.lambda.app;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<>()
        {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        };

        Consumer<String> consumer2 = value -> System.out.println(value);

        consumer.accept("Yanuar Fauzan Isnain");
    }
    
}
