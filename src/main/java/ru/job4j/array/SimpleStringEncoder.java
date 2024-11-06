package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (symbol != input.charAt(i)) {
                result += symbol;
                if (counter > 1) {
                    result += String.valueOf(counter);
                }
                counter = 1;
                symbol = input.charAt(i);
            } else {
                counter += 1;
            }
        }
        result += symbol;
        if (counter > 1) {
            result += String.valueOf(counter);
        }
        return result;
    }
}