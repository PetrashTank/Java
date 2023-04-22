
/*
2.Вывести все простые числа от 1 до 1000 
*/
public class program2 {
    public static void main(String[] args) {
        System.out.println("Простые числа от 1 до 1000: ");
        int number = 1000;
        for (int i = 2; i <= number; i++) {
            boolean flag = true;
            for (int j = 2; j < i && flag == true; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag == true) {
                System.out.printf("%d ", i);
            }
        }
    }
}
