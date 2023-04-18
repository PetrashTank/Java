
/**
 * 1.Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение
 * чисел от 1 до n)
 * 
 * * 
 * 3.Реализовать простой калькулятор
 * 
 * 4.+Задано уравнение вида q + w = e, q, w, e >= 0.
 * Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
 * Требуется восстановить выражение до верного равенства. Предложить хотя бы
 * одно решение или сообщить, что его нет.
 */
import java.util.Scanner;

public class program1 {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int i = number.nextInt();
        System.out.printf("Треугольное число: %d\n", triangularNumber(i));
        number.close();
    }

    public static int triangularNumber(int x) {
        return (x * (x + 1)) / 2;
    }
}