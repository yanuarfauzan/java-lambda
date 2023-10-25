package belajar.java.lambda.app;

import java.util.function.Function;

// Lambda function kita bisa mengatur tipe data parameter nya dan return tipe data nya
public class FunctionApp {
    public static void main(String[] args) {
        Function<String, Integer> functionLength = new Function<>() {
            @Override
            public Integer apply(String value) {
                return value.length();
            }
        };

        System.out.println(functionLength.apply("Eko"));

        Function<String, Integer> functionLength2 = value -> value.length(); 

        System.out.println(functionLength2.apply("Yanuar"));

    }
}
