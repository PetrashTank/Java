//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
package Seminar5;

import java.util.HashMap;
import java.util.LinkedList;

public class program1 {
    public static void main(String[] args) {

        LinkedList<String> lk = new LinkedList<>();
        lk.add(0, " +79246515454, +79654554654");
        lk.add(1, " +79356541245");
        lk.add(2, " +79564561232, +76548785441");
        lk.add(3, " +79653214565");

        LinkedList<String> lk_name = new LinkedList<>();
        lk_name.add(0, "Татьяна ");
        lk_name.add(1, "Николай ");
        lk_name.add(2, "Степан ");
        lk_name.add(3, "Диана ");

        HashMap<String, String> guid = new HashMap<>();
        for (int i = 0; i < lk.size(); i++) {

            guid.put(lk_name.get(i), lk.get(i));

        }
        System.out.println(guid);
    }

}
