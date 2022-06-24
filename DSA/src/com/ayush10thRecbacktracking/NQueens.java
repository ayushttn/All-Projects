package com.ayush10thRecbacktracking;

import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        printNQueens(arr, "", 0);
    }
    public static void printNQueens(int[][] arr, String qfs, int row){
        if (row == arr.length){
            System.out.println(qfs + ".");
            return;
        }
        for (int col = 0; col < arr.length; col++){
            if (isqs(arr, row, col) == true) {
                arr[row][col] = 1;
                printNQueens(arr, qfs + row + "-" + col + ",", row + 1);
                arr[row][col] = 0;
            }
        }
    }
    public static boolean isqs(int[][] arr, int row, int col){
        for (int i = row - 1, j = col; i >= 0; i--){
            if(arr[i][j] == 1){
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(arr[i][j] == 1){
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < arr.length; i--, j++){
            if(arr[i][j] == 1){
                return false;
            }
        }
        return true;
    }
}
