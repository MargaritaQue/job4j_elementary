package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        int i = 0;
        for (int row = 0; row < table.length; row++) {
            i += 1;
            for (int cell = 0; cell < table[row].length; cell++) {
                table[row][cell] = ((row + 1) * cell + i);

            }
        }
        return table;
    }
}
