package com.Karthik.Patterns;

public class PatternNew {
    public static void main(String[] args) {
        patternQ1(3);
    }
    static void patternQ1(int n) {
        int[][] matrix = new int[n][n];
        int start = n * n; // Start with the largest number
        int mid = 1; // Middle number starts at 1

        // Fill the top row
        for (int j = 0; j < n; j++) {
            matrix[0][j] = start--;
        }

        // Fill the middle row
        for (int j = 0; j < n; j++) {
            matrix[1][j] = mid++;
        }

        // Fill the bottom row
        for (int j = n - 1; j >= 0; j--) {
            matrix[2][j] = start--;
        }

        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    static void pattern1(int n){
        for (int row = 0; row < n ; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 1; row <= 2 * n - 1; row++) {
            int cValue = row > n ? 2*n - row : row;
            for (int col = 1; col <= cValue; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int row = 1; row <= n; row++) {
            for(int space = n; space > row; space--){
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for (int row = 1; row <= n; row++) {
            for(int space = n; space > n - row + 1; space--){
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern31(int n){
        int N = n;
        n = 2*n - 2;
        for (int row = 0; row <= n ; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = N - Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
