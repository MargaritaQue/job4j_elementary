package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter += 1;
                if (((i) == input.length() - 1) && (counter > 1)) {
                    result += symbol + String.valueOf(counter);
                }
            } else if (counter > 1) {
                result += symbol + String.valueOf(counter);
                symbol = input.charAt(i);
                counter = 1;
            } else {
                result +=  symbol;
                symbol = input.charAt(i);
            }
            if (((i) == input.length() - 1) && (counter == 1)) {
                result += symbol;
            }
        }
        return result;
    }
}