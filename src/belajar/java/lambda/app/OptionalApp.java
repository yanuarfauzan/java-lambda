package belajar.java.lambda.app;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello(null);
    }

    public static void sayHello(String name) {
        Optional<String> optionalName = Optional.ofNullable(name);
        Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());
        String nameUpper = name.toUpperCase();
        System.out.println("Hello " + nameUpper);
    }
}
