package belajar.java.lambda.app;

import belajar.java.lambda.data.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
        // SimpleAction simpleAction = new SimpleAction() {
        // @Override
        // public String action(String name) {
        // return "Eko";
        // }
        // };

        // SimpleAction simpleAction2 = (String name) -> {
        // return "Yanuar";
        // };

        // System.out.println(simpleAction.action("Yanuar"));
        // System.out.println(simpleAction2.action("Jujun"));

        SimpleAction simpleAction = (String value) -> {
            return "Hallo" + value;
        };

        SimpleAction simpleAction2 = (name) -> {
            return "Selamat Pagi, " + name;
        };

        // tanpa block (no return)

        SimpleAction simpleAction3 = (String name) -> "Hai" + name;

        SimpleAction simpleAction4 = (name) -> "Hai" + name;

        SimpleAction simpleAction5 = name -> "kamu adalah" + name;

        System.out.println(simpleAction3.action("Yanuar"));
        System.out.println(simpleAction4.action("Jujun"));
        System.out.println(simpleAction5.action("Mumu"));
    }
}
