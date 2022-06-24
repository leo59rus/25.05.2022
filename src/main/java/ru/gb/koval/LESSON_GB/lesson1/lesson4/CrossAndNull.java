package ru.gb.koval.LESSON_GB.lesson1.lesson4;

import java.util.Random;
import java.util.Scanner;

import static ru.gb.koval.LESSON_GB.lesson1.Lesson3Massiv.MyScanner.sc;

public class CrossAndNull {
    public static char[][] map;//поле двумерный массив
    public static final int SIZE = 3;//размер поля
    public static final int DOTS_TO_WIN = 3;//количестов для победы
    //за что отвечают символы
    public static final char DOT_EMPTY = '-';
    public static final char DOT_X = 'X';
    public static final char DOT_O = '0';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();//добавляем Random

    public static void main(String[] args) {
        initMap();//инициализация поля
        printMap();//выводим поле в консоль
        //основной цикл игры
        while(true){
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
            aiTurn();
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

    public static void initMap() {//инициализация поля
        map = new char[SIZE][SIZE];
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                map[i][j] = DOT_EMPTY;//все ячейки -
            }
        }
    }
    public static void printMap(){//выводим поле в консоль
        for (int i = 0; i <= SIZE; i++){ //шапка игрового поля для координат X
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++){
            System.out.print((i + 1) + " ");//печать столба 123 для координат Y
            for(int j = 0; j < SIZE; j++){ //печать строки
                System.out.print(map[i][j] + " ");
            }
            System.out.println(); //с переходом на след строку
        }
        System.out.println();
    }
    public static void humanTurn(){//метод отвечающий за ход игрока
        int x, y;
        do {
            System.out.println("введи координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); //проеверяем в методе isCellValid можно ли в ячейку поставить Х
        map[y][x] = DOT_X;
    }
    public static boolean isCellValid(int x, int y) { //можно ли в ячейку поставить Х,0
    if(x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;//выход за пределы поля массива
    if(map[y][x] == DOT_EMPTY) return true;//ячейка пустая
         return false;
    }
    public static void aiTurn(){//ход ии
        int x, y;
        do{
            x = rand.nextInt(SIZE);//любое число от 0 до САЙЗ-1
            y = rand.nextInt(SIZE);
        } while(!isCellValid(x, y));
        System.out.println("ИИ ставит 0 в точку" + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    public static boolean checkWin(char symb){//проверка выигрышных комбинаций в данном случае для поля 3*3
        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;
    }
    public static boolean isMapFull(){
        for(int i =0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                if(map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
}
