package ru.gb.koval.LESSON_GB.lesson1.Lesson3Massiv;

import java.util.Random;
import java.util.Scanner;


public class MyScanner {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int d = getNumberFromScanner("Введите число в пределах от 5 до 10", 5,
                10);
        System.out.println("d = " + d);
        System.out.println();

        randomScanner();
    }

    public static int getNumberFromScanner(String message, int min, int max) {
        int x;
        do { // выполняется 1 раз и повторяется пока
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max); //не соблюдается условие
        return x;
    }
    public static void randomScanner(){
        Random rand = new Random();
        int x = rand.nextInt(20);//случайное число от 0 до n – 1 включительно.
        System.out.println(x);
    }
}
