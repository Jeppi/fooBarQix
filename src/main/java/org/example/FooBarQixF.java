package org.example;

import java.util.Arrays;

public class FooBarQixF {

    public static String execute(Integer num) {
        String answer = "";

        answer = applyDivisibleFooBarQix(num, answer);
        answer = applySuffixFooBarQix(num, answer);
        answer = returnNumbersToStringIfContainsNoFooBarQix(num, answer);

        return answer;
    }


    private static String applyDivisibleFooBarQix(Integer num, String answer) {
        if (isDivisibleBy(num, 3)) {
            answer += "Foo";
        }
        if (isDivisibleBy(num, 5)) {
            answer += "Bar";
        }
        if (isDivisibleBy(num, 7)) {
            answer += "Qix";
        }
        return answer;
    }

    private static String applySuffixFooBarQix(Integer num, String answer) {

        answer += Arrays.stream(num.toString().split(""))
                .map(FooBarQixF::replaceByFooBarQix)
                .reduce("", String::concat);

        // Si on n'a pas de Foo Bar ou Fix avant "*", "*" sera traité dans le cas de conversion numérique,
        // car la règle métier s'applique différemment.
        if (!answer.isEmpty() && answer.charAt(0) == '*') {
            answer = "";
        }

        return answer;
    }


    private static String replaceByFooBarQix(String element) {
        String answer = "";
        switch (element) {
            case "3" -> answer = "Foo";
            case "5" -> answer = "Bar";
            case "7" -> answer = "Qix";
            case "0" -> answer = "*";
        }
        return answer;
    }

    private static String returnNumbersToStringIfContainsNoFooBarQix(Integer num, String answer) {
        if (answer.isEmpty()) {

            return Arrays.stream(num.toString().split(""))
                    .map(s -> s.equals("0") ? "*" : s)
                    .reduce("", String::concat);

        }
        return answer;
    }

    private static boolean isDivisibleBy(int num, int divider) {
        return num % divider == 0;
    }

}
