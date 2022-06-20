package ru.gb.koval.lesson3_2_l2;

import com.sun.source.tree.Tree;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(19);
        list.add(139);
        list.add(149);
        list.add(19);//может содержать одинаковые элементы
        System.out.println(list);

        System.out.println();
        //дубликаты исчезают тк элементы остаются только не повторяющиеся
        HashSet<String> set = new HashSet<>();
        set.add("D");
        set.add("D");
        set.add("D");
        set.add("D");
        set.add("п");
        set.add("а");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        System.out.println(set);//выводит в случайном порядке
        for (String s : set) {
            System.out.println(s);
        }
        boolean x = set.contains("п");
        System.out.println(x);

        //выводит в случайном порядке
        set.add("qwe");
        System.out.println(set);
        System.out.println();


//уаорядоченный хэш
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("D");
        set1.add("D");
        set1.add("D");
        set1.add("D");
        set1.add("п");
        set1.add("а");
        set1.add("b");
        set1.add("c");
        set1.add("d");
        set1.add("e");
        System.out.println(set1);
//сортирует по алфавиту/возрастанию
        TreeSet<String> set2 = new TreeSet<>();
        set2.add("D");
        set2.add("D");
        set2.add("D");
        set2.add("D");
        set2.add("п");
        set2.add("a");
        set2.add("b");
        set2.add("c");
        set2.add("d");
        set2.add("A");
        set2.add("B");
        set2.add("C");
        set2.add("xA");
        set2.add("Ax");
        set2.add("AX");
        set2.add("AXx");
        System.out.println(set2);

        TreeSet<Integer> set4 = new TreeSet<>();
        set4.add(1);
        set4.add(4);
        set4.add(5);
        set4.add(6);
        set4.add(7);
        set4.add(8);
        set4.add(0);
        set4.add(1);
        set4.add(1);
        set4.add(1);
        System.out.println(set4);
    }
}
