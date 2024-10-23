package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            char xx = board[row][i];
            if (xx != ('X')) {
                result = false;
                break;
            }

        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            char xx = board[i][column];
            if (xx != ('X')) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            result[i] = board[i][i];
        }
        return result;
    }
}