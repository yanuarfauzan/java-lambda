package belajar.java.lambda.app;

import java.util.function.Supplier;

// Lambda return data tanpa ngirim parameter
public class SupplierApp {
    public static void main(String[] args) {
        Supplier<String> suplier = () -> "Yanuar Fauzan Isnain";

        System.out.println(suplier.get());
    }
}
