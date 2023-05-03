// Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:
// Разность:
// A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
// B - A = все числа из второй коллекции, которые не содержатся в первой
// Симметрическая разность:
// A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой
package Seminar3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class program4 {
    private static List<Integer> list(int size) {
        List<Integer> list = new ArrayList<Integer>(size);
        Random rand = new Random();
        for (int i = 0; i < size; i++)
            list.add(rand.nextInt(20));
        return list;
    }

    private static List<Integer> difference(List<Integer> list1, List<Integer> list2) {
        List<Integer> list = new ArrayList<Integer>(list1.size());
        list.addAll(list1);
        list.removeAll(list2);
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list1 = list(7);
        List<Integer> list2 = list(7);
        System.out.print("Первое множество А: " + list1 + " \n");
        System.out.print("Второе множество В: " + list2 + " \n");
        System.out.print("А - В = " + difference(list1, list2) + " \n");
        System.out.print("B - A = " + difference(list2, list1) + " \n");
        List<Integer> list = difference(list1, list2);
        list.addAll(difference(list2, list1));

        System.out.print("A ^ B = " + list + " \n");
    }
}
