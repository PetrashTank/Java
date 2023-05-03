// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.
package Seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class program3 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(20);
            list.add(randomNumber);
        }
        System.out.println("Исходный массив: " + list);
        int min = Collections.min(list); 
        int max = Collections.max(list);
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double avg = sum / list.size();

        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println("Среднее арифметическое: " + avg);
    }
}
