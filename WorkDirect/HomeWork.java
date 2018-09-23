package ru.eskendarov.ea.homework;

import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        String justWords = "ЛЕНТА ПАЛЬМА КЛЮЧ МИНУТА КУПЮРА " +
                           "КИРПИЧ КЛЮЧ МИНУТА БЕТОН КНОПКА " +
                           "КОНВЕРТ ОКНО КЛЮЧ КОРОНА БОРОДА " +
                           "САМОЛЁТ ЧЕРНИЛА ПРИЕМНИК МИНУТА ПАЛЬМА";
        final List<String> list = Arrays.asList((justWords.split(" ")));
        final Set<String> set = new TreeSet<>(list);
        System.out.println(list);
        System.out.println(set);
        final Map<String, Integer> map = new HashMap<>();
        for (String word : list) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        map.forEach((word, count) -> System.out.println(word + " = " + count));

        final PhoneID phoneID = new PhoneID();
        phoneID.add("Ivan", "78123452100");
        phoneID.add("Alexander", "79777777777");
        phoneID.add("Andrey", "79315550001");
        phoneID.add("Alexander", "79001111111");
        phoneID.add("Mikhail", "78125555000");
        System.out.println(phoneID.get("Alexander"));
    }
}
