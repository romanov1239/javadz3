/*
Задание 2.1.
Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class dz3_3 {
    public static void main (String[] args) {
        String[] planets = new String[] {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"};
        Random rnd = new Random();
        ArrayList <String> str = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            str.add(planets[rnd.nextInt(8)]);
        }
        System.out.println(str);
        Set <String> mySet = new HashSet<String>(str);
        for (String string : mySet) {
            System.out.println(string + " " + Collections.frequency(str, string));
        } 
    }
}
    