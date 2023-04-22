
/**
 * 1.Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение
 * чисел от 1 до n)
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
