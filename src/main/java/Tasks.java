//Задание
//
//        Пусть дан произвольный список целых чисел.
//
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение

import java.util.*;

public class Tasks {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList(); // коллекция
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Collections.shuffle(list); //  произв. порядок

        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i) + " "); //
        }

        System.out.println("Минимальный элемент: " + Collections.min(list));
        System.out.println("Максимальный элемент: " + Collections.max(list));

        double summaEvenArray = 0;
        for (int i = 0; i < list.size(); i++) {
            summaEvenArray = summaEvenArray + list.get(i);
        }
        System.out.println("Среднее значение в списке: " + summaEvenArray / list.size());

        ArrayList<Integer> alist = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) %2 != 0) { //нечет
                alist.add(list.get(i));
            }
        }
        list = null;

        for (int i = 0; i < alist.size(); i++) {
            System.out.println(alist.get(i) + " ");
        }
    }
}