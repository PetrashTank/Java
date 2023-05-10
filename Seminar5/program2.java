
/*
Пусть дан список сотрудников:
Иван Иванов,
Светлана Петрова,
Кристина Белова,
Анна Мусина,
Анна Крутова,
Иван Юрин,
Петр Лыков,
Павел Чернов,
Петр Чернышов,
Мария Федорова,
Марина Светлова,
Мария Савина,
Мария Рыкова,
Марина Лугова,
Анна Владимирова,
Иван Мечников,
Петр Петин,
Иван Ежов.
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
 */
package Seminar5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class program2 {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList(
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов");
        List<String> names = new ArrayList<>();
        for (int i = 0; i < lst.size(); i++) {
            names.add(lst.get(i).split(" ")[0]);
        }
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < names.size(); i++) {
            if (map.containsKey(names.get(i))) {
                int counter = map.get(names.get(i));
                map.put(names.get(i), ++counter);

            } else {
                map.put(names.get(i), 1);
            }
        }

        Map<Integer, List<String>> rMap = new TreeMap<>(Collections.reverseOrder());
        for (Entry<String, Integer> i : map.entrySet()) {
            if (rMap.containsKey(i.getValue())) {
                rMap.get(i.getValue()).add(i.getKey());
            } else {
                List<String> countKey = new ArrayList<>();
                countKey.add(i.getKey());
                rMap.put(i.getValue(), countKey);
            }
        }
        for (Entry<Integer, List<String>> i : rMap.entrySet())
            System.out.println(i.getKey() + " " + i.getValue());
    }
}
