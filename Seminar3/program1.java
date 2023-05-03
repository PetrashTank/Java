// Реализовать алгоритм сортировки слиянием.
package Seminar3;

import java.util.Arrays;
import java.util.Random;

public class program1 {
    public static class Main {
        public static int[] mergeSort(int[] sortArray) {
            int[] n = Arrays.copyOf(sortArray, sortArray.length);
            int[] m = new int[sortArray.length];
            int[] result = mergeSortInner(n, m, 0, sortArray.length);
            return result;
        }

        public static int[] mergeSortInner(int[] n, int[] m, int startIndex, int endIndex) {
            if (startIndex >= endIndex - 1) {
                return n;
            }

            // отсортированный
            int middle = startIndex + (endIndex - startIndex) / 2;
            int[] sorted1 = mergeSortInner(n, m, startIndex, middle);
            int[] sorted2 = mergeSortInner(n, m, middle, endIndex);

            //слияние
            int index1 = startIndex;
            int index2 = middle;
            int destIndex = startIndex;
            int[] result = sorted1 == n ? m : n;
            while (index1 < middle && index2 < endIndex) {
                result[destIndex++] = sorted1[index1] < sorted2[index2]
                        ? sorted1[index1++]
                        : sorted2[index2++];
            }
            while (index1 < middle) {
                result[destIndex++] = sorted1[index1++];
            }
            while (index2 < endIndex) {
                result[destIndex++] = sorted2[index2++];
            }
            return result;
        }

        public static void main(String args[]) {
            Random r = new Random();
            int[] ar1 = new int[10];
            System.out.print("Неотсортированный массив \n");
            for (int i = 0; i < ar1.length; i++) {
                ar1[i] = r.nextInt(10);
                System.out.print(ar1[i] + " ");
            }
            System.out.print("\nОтсортированный массив \n");

            int[] sortArray = ar1;
            int[] result = mergeSort(sortArray);
            System.out.println(Arrays.toString(result));

        }
    }
}
