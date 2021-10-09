package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rAndC = Arrays.stream(scanner.nextLine().split("\\s+"))
        .mapToInt(Integer::parseInt)
        .toArray();

        int rfirst = rAndC[0];
        int cfirst = rAndC[1];

        int[][] firstArr = new int[rfirst][];

        for (int row = 0; row < rfirst; row++) {
            int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
           firstArr[row] = input;
        }

        int[] dimantions = Arrays.stream(scanner.nextLine().split("\\s+"))
                   .mapToInt(Integer::parseInt)
                   .toArray();


        int [][] secondArr = new int[dimantions[0]][];

        for (int row = 0; row < dimantions[0]; row++) {

            int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            secondArr[row] = input;

        }


       boolean isEqual = compear(firstArr, secondArr);

        String equal = isEqual
                ? "equal"
                : "not equal";

        System.out.println(equal);

        /*if (isEqual) {
            System.out.println("Equal");
        }else {
            System.out.println("not equal");
        }*/



        


    }

    private static boolean compear(int[][] firstArr, int[][] secondArr) {
        boolean isEqual = true;

        if (firstArr.length != secondArr.length){
            return false;
        }
        for (int row = 0; row < firstArr.length; row++) {
            if (firstArr[row].length!= secondArr[row].length) {
                return false;
            }
            for (int col = 0; col < firstArr[row].length; col++) {
                int x = firstArr[row][col];
                int y = secondArr[row][col];
                if (y != x) {
                    return false;
                }
            }
        }
        return true;

    }
}
