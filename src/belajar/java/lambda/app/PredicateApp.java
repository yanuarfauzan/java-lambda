package belajar.java.lambda.app;

import java.util.function.Predicate;

// Lambda return value nya boolean
public class PredicateApp {
    public static void main(String[] args) {
        Predicate<String> predicateCheckBlank = value -> value.isBlank();

        System.out.println(predicateCheckBlank.test(""));
        System.out.println(predicateCheckBlank.test("Yanuar"));
    }
}
