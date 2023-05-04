// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
package Seminar4;

import java.util.LinkedList;

public class program2 {
    private static LinkedList<Integer> list = new LinkedList<>();

    // добавляет элемент в хвост очереди
    public static void enqueue(int value) {
        list.offerLast(value);
    }

    // удаляет элемент из головы очереди
    public static int dequeue() {
        return list.pollFirst();
    }

    // возвращает первый элемент не удаляя его
    public static int first() {
        return list.peekFirst();
    }

    public static void main(String[] args) {

        for (int i = 10; i < 101; i = i + 10) {
            enqueue(i);
        }
        System.out.println("Первоначальная очередь: " + list);
        System.out.println("Удаление первого элемента " + dequeue());
        System.out.println("Удаление следущего элемента " + dequeue());
        System.out.println("Удаление следущего элемента " + dequeue());
        System.out.println("Удаление следущего элемента " + dequeue());
        System.out.println("Первый элемент новой очереди " + first());
        System.out.println("Очередь после удаления элементов " + list);
    }
}
