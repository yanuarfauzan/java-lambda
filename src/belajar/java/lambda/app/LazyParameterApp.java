package belajar.java.lambda.app;

import java.util.function.Supplier;

public class LazyParameterApp {
    public static void main(String[] args) {
        testScore2(70, () -> getName());
    }

    // Bukan Lazy
    public static void testScore(int score, String name) {
        if (score < 80) {
            System.out.println("Sorry " + name + ", your score is too low");
        } else {
            System.out.println("Congratulation! You have passed the exam with a score of: " + score);
        }
    }
    // Lazy Parameter (cuma akan di eksekusi ketika lambda nya dipanggil)
    public static void testScore2(int score, Supplier<String> name) {
        if (score < 80) {
            System.out.println("Sorry " + name.get() + ", your score is too low");
        } else {
            System.out.println("Congratulation! You have passed the exam with a score of: " + score);
        }
    }

    public static String getName() {
        System.out.println("Method getName() di Panggil");
        return "Eko";
    }
}
