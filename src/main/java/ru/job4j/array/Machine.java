package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int x = money - price;
        for (int i : coins) {
            while (x >= i) {
                x = x - i;
                result[size] = i;
                size += 1;
            }
        }
        return Arrays.copyOf(result, size);
    }
}