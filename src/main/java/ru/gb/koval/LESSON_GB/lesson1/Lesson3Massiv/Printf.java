package ru.gb.koval.LESSON_GB.lesson1.Lesson3Massiv;

public class Printf {
    public static void main(String[] args) {
        System.out.printf("Слово: %s, Число с плавающей запятой: %f, Целое число: %d, " +
                "Символ: %c", "Java", 2.5f, 20, 'e');
        System.out.println();
        //сравнение строк
        String str1 = "Azzx";
        String str2 = "Azzx";
        String str3 = "B";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

}

}

