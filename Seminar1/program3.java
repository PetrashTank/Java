
/*
 * 3.Реализовать простой калькулятор
 */
import java.io.IOException;
import java.util.Scanner;

public class program3 {
    public static void main(String[] args) throws IOException {

        double num1;
        double num2;
        double res;
        char operator;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите первое число: \n");
        num1 = reader.nextDouble();
        System.out.print("Введите второе число: \n");
        num2 = reader.nextDouble();
        System.out.print("Введите действие (+, -, *, /): ");
        operator = reader.next().charAt(0);
        reader.close();
        switch (operator) {
            case '+':
                res = num1 + num2;
                System.out.print("Результат равен:\n");
                System.out.printf(num1 + " " + operator + " " + num2 + " = " + res);

                break;
            case '-':
                res = num1 - num2;
                System.out.print("Результат равен:\n");
                System.out.printf(num1 + " " + operator + " " + num2 + " = " + res);

                break;
            case '*':
                res = num1 * num2;
                System.out.print("Результат равен:\n");
                System.out.printf(num1 + " " + operator + " " + num2 + " = " + res);

                break;
            case '/':
                if (num2 != 0) {
                    res = num1 / num2;
                    System.out.print("Результат равен:\n");
                    System.out.printf(num1 + " " + operator + " " + num2 + " = " + res);
                } else {
                    System.out.printf("На ноль делить нельзя");
                }
                break;
            default:
                System.out.printf("Ошибка, такого оператора нет в списке");
                return;
        }
    }

}
