package application;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("What's the size of matrix? ");
        int n = key.nextInt();

        Integer[][] num = new Integer[n][n];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num[i][j] = key.nextInt();
            }
        }

        System.out.println();
        int negativeNum = 0;

        System.out.println("Main diagonal: ");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j]) {
                    System.out.print(num[i][j] + " ");
                }
                if (num[i][j] < 0) {
                    negativeNum++;
                }
            }
        }
        System.out.println();
        System.out.print("Negative numbers = " + negativeNum);


    }
}
