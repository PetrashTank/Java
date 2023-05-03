// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

package Seminar3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class program2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(10);
            numbers.add(randomNumber);
        }
        System.out.println("Исходный массив: " + numbers);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--;
            }
        }
        System.out.println("Список нечетных чисел: " + numbers);
    }
}
