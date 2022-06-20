package ru.gb.koval.LESSON_GB.lesson1.Lesson3Massiv;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson3andScanner {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        int[] nums = new int[4];
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 10;
        nums[3] = 10;
        System.out.println(nums[0]);
        System.out.println(Arrays.toString(nums));

        int[] nums1 = {5, 10, 15, 20};
        System.out.println(Arrays.toString(nums1));


        int counter = 1;
        int[][] table = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                table[i][j] = counter;
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();
        }

        int[] arrs = {2, 4, 5, 1, 2, 3, 4, 5};
        System.out.println("arrs.length: " + arrs.length);
        for (int i = 0; i < arrs.length; i++) {
            System.out.print(arrs[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println();
        //Scanner


        // Scanner sc = new Scanner(System.in);
        // System.out.println("Введите число: ");
        // int a = sc.nextInt();
        // a *= 2;
        // System.out.println("Введенное вами число, умноженное на 2, равно " + a);
        // sc.close();

        //таблица
        print2DArray(table);

        System.out.println();
        System.out.println();
        System.out.println();
        //сумма чисел массива
        System.out.println(arrSum(arrs));
    }

    public static void print2DArray(int[][] ar) {
        for (int i = 0; i <= ar[0].length; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int i = 0; i < ar.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int arrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;


    }
}

