package org.example;

public class SudokuSolver {

    public static void main(String[] args) {
        int[][] sudokuGrid = generateSudoku();
        printSudoku(sudokuGrid);
    }

    public static int[][] generateSudoku() {
        int[][] sudokuGrid = new int[4][4];
        fillSudoku(sudokuGrid, 0, 0);
        return sudokuGrid;
    }

    public static void fillSudoku(int[][] grid, int row, int col) {
        if (row == 4) {
            return;
        }

        int nextRow = col == 3 ? row + 1 : row;
        int nextCol = (col + 1) % 4;

        for (int num = 1; num <= 4; num++) {
            if (isValid(grid, row, col, num)) {
                grid[row][col] = num;
                fillSudoku(grid, nextRow, nextCol);
                return; // stop after finding a valid number
            }
        }
    }

    public static boolean isValid(int[][] grid, int row, int col, int num) {
        // Check if num is not already in current row, col and 2x2 subgrid
        for (int i = 0; i < 4; i++) {
            if (grid[row][i] == num || grid[i][col] == num) {
                return false;
            }
        }

        int startRow = row - row % 2;
        int startCol = col - col % 2;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (grid[i + startRow][j + startCol] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void printSudoku(int[][] grid) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
