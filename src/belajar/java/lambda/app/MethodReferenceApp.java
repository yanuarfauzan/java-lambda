package belajar.java.lambda.app;

import java.util.function.Function;
import java.util.function.Predicate;

import belajar.java.lambda.util.StringUtil;

public class MethodReferenceApp {
    public static void main(String[] args) {
        // Predicate<String> predicatIsLowerCase = value -> StringUtil.isLowerCase(value);
        
        // Menggunakan Method Reference
        Predicate<String> predicatIsLowerCase = StringUtil::isLowerCase;
        System.out.println(predicatIsLowerCase.test("Yanuar"));
        System.out.println(predicatIsLowerCase.test("yanuar"));
        

    }

    public void run(){
        Predicate<String> predicatIsLowerCase = this::isLowerCase;
        System.out.println("ini method reference satu class");
        System.out.println(predicatIsLowerCase.test("Yanuar"));
        System.out.println(predicatIsLowerCase.test("yanuar"));
        // Method Reference di Parameter
    
        Function<String, String> functionUpper = new Function<String, String>()
        {
            @Override
            public String apply(String value) {
                return value.toUpperCase();
            }
        };
    
        // Lambda
        Function<String, String> functionUpper2 = value -> value.toUpperCase();
        
        
        // Method reference milik si parameter (method nya harus tidak boleh punya parameter)
        Function<String, String> functionUpper3 = String::toUpperCase;
        System.out.println(functionUpper3.apply("Eko"));
    }


    
    public boolean isLowerCase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
