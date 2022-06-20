package ru.gb.koval.LESSON_GB.lesson1.lesson2;

public class Lesson2CIKLY {
    public static void main(String[] args) {


        // для вызова метода необходимо передать ему 2 аргумента типа int,
        // результатом работы будет целое число, которое напечатается в консоль
        //System.out.println(summ(5, 5));

        // для вызова метода ему не нужно передавать аргументы,
        // и он не возвращает данные (метод объявлен как void)
        // printSomeText();

        // для вызова метода передаем ему в качестве аргумента строку "Java",
        // которую он выведет в консоль
        //printMyText("Java");

        // mcase();

        // mfor();

        //mmfor();

        // mForBreak();

        //mForEach();

        //mForFor();

        mForStars();


    }

    // метод возвращает целое число, принимает на вход два целых числа
    public static int summ(int a, int b) {
// возвращаем сумму чисел
        return a + b;
    }

    // метод ничего не возвращает, не требует входных данных
    public static void printSomeText() {
// печатаем Hello в консоль
        System.out.println("Hello");
    }

    public static void printMyText(String txtToPrint) {
        // выводим строку txtToPrint в консоль
        System.out.println(txtToPrint);
    }

    public static void mcase() {
        int a = 1;
        switch (a) {
            case 1:
                System.out.println("a = 1");
                break;

            case 3:
                System.out.println("a = 3");
                break;
            default:
                System.out.println("Ни один из case не сработал");
        }
    }

    public static void mfor() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("end");
    }

    public static void mmfor() {
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i-j: " + i + "-" + j);
        }
    }

    public static void mForBreak() {
        for (int i = 0; i < 10; i++) {
            if (i > 3) {
                break;
            }
            System.out.println("i = " + i);
        }

    }

    public static void mForEach() {
        String[] sm = {"A", "B", "C", "D"};
        for (String o : sm) {
            System.out.print(o + " ");
        }
    }

    public static void mForFor() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + i + j);
            }
        }
    }

    public static void mForStars() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || i == 5 || j == 0 || j == 5) {
                    System.out.print("  *");
                } else {
                    System.out.print("  0");
                }
            }
            System.out.println();
        }
        System.out.println();
//чтобы знать расположене
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(i + "i." + j + "j ");
            }

            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i < j) {
                    System.out.print("  *");
                } else if (i > j) {
                    System.out.print("  0");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || j == 5 || j == 0 || i == 5) {
                    System.out.print("  *");
                } else if (i == j) {
                    System.out.print("  *");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i < j) {
                    System.out.print("   ");
                } else if (i == 0 || j == 5 || j == 0 || i == 5) {
                    System.out.print("  *");
                } else if (i == j) {
                    System.out.print("  *");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || i == 1 || i == 4 || i == 5 || j == 0 || j == 1 || j == 4 || j == 5 ) {
                    System.out.print("  *");
                } else {
                    System.out.print("  0");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i < 2 && j > 3) {
                    System.out.print("  *");
                } else if (i > 3 && j < 2) {
                    System.out.print("  *");
                } else {
                    System.out.print("  0");
                }
            }
            System.out.println();
        }
    }
}



