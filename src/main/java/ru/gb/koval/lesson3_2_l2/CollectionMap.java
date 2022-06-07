package ru.gb.koval.lesson3_2_l2;

import java.util.HashMap;

public class CollectionMap {
    public static void main(String[] args) {
        //int для ключа, string для значения
        HashMap<Integer, String> map = new HashMap<>();
        //кладем значение
        map.put(1, "пн");
        map.put(2, "вт");
        map.put(3, "ср");
        map.put(4, "чт");
        map.put(5, "пт");
        map.put(6, "сб");
        map.put(7, "вс");

        map.put(3, "среда");//перезапишется
        System.out.println(map);
        //вывести значение
        String s = map.get(7);
        System.out.println(s);

        //есть ли этот ключ тру фолс
        boolean b = map.containsKey(9);
        //есть ли значение
        boolean sb = map.containsValue("сб");
        System.out.println(b);
        System.out.println(sb);


    }
}
