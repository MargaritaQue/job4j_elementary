package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        int[] ex = new int[2];
        while (i != j) {
            if (target - array[i]  == array[j]) {
                ex[0] = i;
                ex[1] = j;
                return ex;
            } else if (target - array[i] > array[j]) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }
}