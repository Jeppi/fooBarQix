package org.example;

public class FooBarQix {

    public static String execute(Integer num) {
        String answer = "";

        answer = applyFooBarQix(num, answer);
        answer = addSuffixFooBarQix(num, answer);
        answer = returnNumbersIfContainsNoFooBarQix(num, answer);

        return answer;
    }

    private static String applyFooBarQix(int num, String answer) {
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

    private static String addSuffixFooBarQix(Integer num, String answer) {
        String str = num.toString();
        String[] strs = str.split("");

        for (String st : strs) {
            if (st.equals("3")) {
                answer += "Foo";
            } else if (st.equals("5")) {
                answer += "Bar";
            } else if (st.equals("7")) {
                answer += "Qix";
            } // un nombre ne peut commencer par un 0, s'il s'agit d'un autre chiffre ça ne fonctionnera pas
            // TODO : à généraliser pour d'autres valeurs que 0.
            else if (!answer.isEmpty() && st.equals("0")) {
                answer += "*";
            }
        }
        return answer;
    }

    private static String returnNumbersIfContainsNoFooBarQix(Integer num, String answer) {
        if (answer.isEmpty()) {
            String str = num.toString();
            String[] strs = str.split("");

            // RM : On doit remplacer les 0 et garder les autres chiffres.
            for (String st : strs) {
                if (st.equals("0")) {
                    answer += "*";
                } else {
                    answer += st;
                }
            }
        }
        return answer;
    }

    private static boolean isDivisibleBy(int num, int divider) {
        return num % divider == 0;
    }

}
