// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
package Seminar4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class program1 {
    public static List<Integer> reverse(List<Integer> direct) {
        List<Integer> reversed = new LinkedList<>();

        for (int i = direct.size() - 1; i >= 0; i--) {
            reversed.add(direct.get(i));
        }

        return reversed;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(10);
        Random rand = new Random();
        for (int i = 0; i < 10; i++)
            list.add(rand.nextInt(20));

        System.out.println("Исходный список: " + list);

        List<Integer> revData = reverse(list);
        System.out.println("Перевернутый список: " + revData);
    }

}
