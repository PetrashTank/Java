// В файле содержится строка с данными:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
package Seminar2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class program3 {
    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("Seminar2/data.txt"), "UTF-8"))) {
            String data;
            while ((data = br.readLine()) != null) {
                sb.append(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<String, String> dictionary = new HashMap<>();
        String[] keys = sb.toString().replace("{", "").replace("[", "").replace("]", "").replace("\"", "")
                .replace("]", "").replaceAll("\\s", "").split("},");
        for (String data : keys) {
            String[] person = data.split(",");
            for (String keyValues : person) {
                String[] keyValue = keyValues.replace("}", "").split(":");
                String key = keyValue[0];
                String value = keyValue[1];
                dictionary.put(key, value);
            }
            String surname = dictionary.get("фамилия");
            String score = dictionary.get("оценка");
            String lesson = dictionary.get("предмет");
            System.out.printf("Студент %s получил %s по предмету %s\n", surname,
                    score, lesson);
        }
    }
}
