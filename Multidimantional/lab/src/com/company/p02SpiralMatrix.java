package com.company;

import java.util.Scanner;

public class p02SpiralMatrix {
    public static void main(String[] args) {

        System.out.println("Enter Matrix dimantion! (Onli one Integer)");

        int x = new Scanner(System.in).nextInt();

        int[][] arr = new int[x][x];

        System.out.println(arr[1][1]);

        int count = 0;
        String direction = "right";

        int next = 0;

        /*/for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (direction.equals("right")){

                }
            }
        }*/
        int row = 0;
        int col= 0;

        for (int i = 0; i < x*x; i++) {
            count++;
            if (direction.equals("right")) {
                if (row == 0 && col == 0 && arr[row][col] == 0) {
                    arr[row][col] = count;
                    //col++;
                    continue;
                }
                if (isValid(arr, col + 1)) {
                    col++;
                    if (arr[row][col] == 0) {
                        arr[row][col] = count;
                    } else {
                        i -= 1;
                        count -= 1;
                        col--;
                        direction = "down";
                    }
                } else {
                    i -= 1;
                    count -= 1;
                    direction = "down";
                }


            } else if (direction.equals("down")) {

                if (isValid(arr, row + 1)) {
                    row++;
                    if (arr[row][col] == 0) {
                        arr[row][col] = count;
                    } else {
                        i -= 1;
                        count -= 1;
                        row--;
                        direction = "left";
                    }
                } else {
                    i -= 1;
                    count -= 1;
                    direction = "left";
                }


            } else if (direction.equals("left")) {

                if (isValid(arr, col - 1)) {
                    col--;
                    if (arr[row][col] == 0) {
                        arr[row][col] = count;
                    } else {
                        i -= 1;
                        count -= 1;
                        col++;
                        direction = "up";
                    }
                } else {
                    i -= 1;
                    count -= 1;
                    direction = "up";
                }



            } else if (direction.equals("up")) {

                if (isValid(arr, row - 1)) {
                    row--;
                    if (arr[row][col] == 0) {
                        arr[row][col] = count;
                    } else {
                        row++;
                        i -= 1;
                        count -= 1;
                        direction = "right";
                    }
                } else {
                    i -= 1;
                    count -= 1;
                    direction = "right";
                }
            }
        }
        for (int ro = 0; ro < arr.length; ro++) {
            System.out.println();
            for (int co = 0; co < arr[row].length; co++) {
                if (arr[ro][co]<10){
                    System.out.printf(" %d ",arr[ro][co]);
                }else {

                    System.out.printf("%d ", arr[ro][co]);
                }
            }
        }


    }

    private static boolean isValid(int[][] arr, int i) {
        return i>=0 && i< arr.length;
    }
}
