// Реализовать алгоритм пирамидальной сортировки (HeapSort).
package Seminar5;

import java.util.Arrays;

public class program3 {

    public static void heapSort(int[] arr) {
        int size = arr.length - 1;
        for (int i = arr.length / 2; i >= 0; i--)
            heapify(arr, i, size);
        for (int i = size; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[size];
            arr[size--] = temp;
            heapify(arr, 0, size);
        }
        System.out.println("\nОтсортированный массив: \n" + Arrays.toString(arr));
    }

    public static void heapify(int[] arr, int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (left <= size && arr[left] > arr[largest])
            largest = left;
        if (right <= size && arr[right] > arr[largest])
            largest = right;
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, largest, size);
        }

    }
    public static void main(String[] args) {

        int[] array = new int[20];
        int max = 50;
        int min = -50;
        System.out.print("Неотсортированный массив: \n");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * (max - min) + min));
            System.out.print(array[i] + " ");
        }
        heapSort(array);
    }
}
