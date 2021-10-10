package com.company;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class p03WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = Integer.parseInt(scanner.nextLine());

        int[][] arr = new int[r][];
        int[][] printArr = new int[r][];

        for (int row = 0; row < r; row++) {
            int[] arrLine = getArrLine(scanner);
            arr[row] = new int[arrLine.length];
            printArr[row] = new int[arrLine.length];
            for (int col = 0; col < arrLine.length ; col++) {

                arr[row][col] = arrLine[col];
                printArr[row][col] = arrLine[col];
            }

            }

        int[] index = getArrLine(scanner);
        int wrong = arr[index[0]][index[1]];



        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == wrong) {

                    int sum = getSum(arr, row, col, wrong);
                    printArr[row][col]= sum;

                }
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.printf("%d ",printArr[row][col]);
            }
            System.out.println();
        }






    }

    private static int getSum(int[][] arr, int row, int col, int n) {
        int sum = 0;

        if (isValid(arr, row+1, col)&&arr[row+1][col] != n) {

                sum+= arr[row+1][col];

        }
        if (isValid(arr, row-1, col)&& arr[row-1][col] != n) {
            sum+= arr[row-1][col];
        }
        if (isValid(arr, row, col-1)&&arr[row][col-1] != n) {
            sum+= arr[row][col-1];
        }
        if (isValid(arr, row, col+1)&& arr[row][col+1] != n) {
            sum+= arr[row][col+1];
        }

            return sum;



    }

    private static boolean isValid(int[][] arr, int row, int col){
        return row>=0 && row< arr.length
                && col>=0 && col<arr[row].length;
    }

    private static int[] getArrLine(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
