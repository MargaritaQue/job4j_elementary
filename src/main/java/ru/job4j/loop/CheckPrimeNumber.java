package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        int n = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                n += 1;
            }
        }
        if (n != 2) {
            prime = false;
        }
        return prime;
    }
}