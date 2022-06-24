package ru.gb.koval.LESSON_GB.lesson1.lesson4;

import java.util.Random;
import java.util.Scanner;
//не смог сделать проверку на поле 5*5
public class CrossAndNullMY {
    public static char[][] map; //массив поля
    public static final int SIZE = 5;//размер
    public static final int DOTS_TO_WIN = 5;//количество выигрышных символов

    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final char DOT_EMPTY = '~';

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true){
            humanTurn();
            printMap();
            if(checkWin(DOT_X)){
                System.out.println("HUMAN WIN");
                break;
            }
            if(isMapFull()){
                System.out.println("НИЧЬЯ");
                break;
            }
            iiTurn();
            printMap();
            if(checkWin(DOT_O)){
                System.out.println("II WIN");
                break;
            }
            if(isMapFull()){
                System.out.println("НИЧЬЯ");
                break;
            }
        }
        System.out.println("GAME END");
    }
    //создаём поле
    public static void initMap(){
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    //печатаем поле
    public static void printMap(){
        for(int i = 0; i <= SIZE; i++){
            System.out.print(i + "  ");//шапка
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + "  ");//столбец вниз от 1го
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void humanTurn() {
        int x, y;
        do{
            System.out.println("Введите координаты в формате X, Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }
public static boolean isCellValid(int x, int y){
        if(x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if(map[y][x] == DOT_EMPTY) return true;
        return false;
}
public static void iiTurn(){
        int x, y;
    do{
        x = rand.nextInt(SIZE);
        y = rand.nextInt(SIZE);
    } while (!isCellValid(x, y));
    System.out.println("ИИ сходил " + (x + 1) + " "+ (y + 1));
    map[y][x] = DOT_O;
}
public static boolean checkWin(char symb){
    for (int i = 0; i < map.length; i++) {
        for (int j = 0; j < map.length; j++) {
            if(i == j && map[i][j] == symb) return true;
         //   if((i == 0 || i == 1 || i == 2 || i == 3 || i == 4) && map[i][j] == symb) return true;
         //   if((j == 0 || j == 1 || j == 2 || j == 3 || j == 4) && map[i][j] == symb) return true;
        }
    }return false;
}
public static boolean isMapFull(){
    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            if (map[i][j] == DOT_EMPTY) return false;
        }
    }
    return true;
}
}
