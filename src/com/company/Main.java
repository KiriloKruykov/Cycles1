/*
 * Classname Main
 *
 * Version info 1
 *
 * Copyright Kirill Kryukov KNUTE
 */
package com.company;

public class Main {

    public static  void main(String[] args) {
        // Task1 Write to console 8 facts about yourself using primitive types.
        int age = 21;
        byte day = 26;
        float height = 185.5f;
        short one = 1;
        long two = 2;
        char play = '6';
        double see = 3;
        double result = (day) - (two + one);
        String aboutMyself = "My name is Kirill. I am" + age + "years old." +
                " My height is " + height + "cm. I was born on the" + day +
                " July. I have" + one + "native sister" + two + "cousins.Love" +
                "play street basketball with my" + play + "former classmates\n and  love" +
                " go to the cinema " + see + "d.I know my friends already" +
                result + ".                           ";
        System.out.println(aboutMyself);
        System.out.println(aboutMyself.length());

        // Check a string as a palindrome.

        // String sentence = "Туши рано фонари, шут!";
        // String sentence = "Я ел мясо лося, млея";
        // String sentence = "Я не реву - уверен я";
        // String sentence = "Я умру, хлебороб, ел хурму я";
        // String sentence = "Умер, и мир ему.";

        String sentence = "Я не реву - уверен я";
        sentence = sentence.toLowerCase();
        sentence = sentence.replaceAll(" ", "")
                .replaceAll("\\.", "")
                .replaceAll("-", "")
                .replaceAll("–", "")
                .replaceAll("\\.", "")
                .replaceAll(",", "")
                .replaceAll("\\?", "")
                .replaceAll("\"", "")
                .replaceAll("«", "")
                .replaceAll("»", "")
                .replaceAll("\\!", "");

        String template = "";

        for (int i = 0; i < sentence.length(); i++) {
            int index = sentence.length() - i - 1;
            template += sentence.charAt(index);
        }

        System.out.println(template);

        if (sentence.equals(template)) {
            System.out.println("This sentence is palindrom - TRUE");
        } else {
            System.out.println("This sentence is not palindrom - FALSE");
        }

        // Task4. Get the area limited by the following functions.
        // M 'y' = 0.3

        double start = 0;
        double finish = Math.PI;
        double deltaX = 0.1;
        double y = 0.3;

        double area = 0;

        for (double x = 0; x < finish; x += deltaX) {
            double rectangle = 0;
            if (Math.sin(x) < y) {
                rectangle = Math.sin(x) * deltaX;
            } else {
                rectangle = y * deltaX;
            }

            area += rectangle;
        }

        System.out.println(area);
    }

}