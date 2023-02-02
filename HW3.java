import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class HW3 {

    public static void main(String[] args) {
        task2();
    }

    public static void task1() {
        /*
         * Пусть дан произвольный список целых чисел, удалить из него четные числа
         */
        ArrayList<Integer> arrList = new ArrayList<>();
        Random random = new Random();
        int n = random.nextInt(2, 20);
        for (int i = 0; i < n; i++) {
            arrList.add(random.nextInt(10, 99));
        }
        System.out.println("Начальный список: " + arrList);
        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i) % 2 == 0) {
                arrList.remove(i);
                i--;
            }
        }
        System.out.println("Итоговый список: " + arrList + "\n");
    }

    public static void task2() {
        /*
         * Задан целочисленный список ArrayList. Найти минимальное, максимальное и
         * среднее арифметическое из этого списка. Collections.max()
         */
        ArrayList<Integer> arrList = new ArrayList<>();
        Random random = new Random();
        int n = random.nextInt(10, 50);
        for (int i = 0; i < n; i++) {
            arrList.add(random.nextInt(10, 99));
        }
        System.out.println("Список: " + arrList);
        int minEl = Collections.min(arrList);
        int maxEl = Collections.max(arrList);
        int summ = 0;
        for (int item : arrList) {
            summ += item;
        }
        double arthMean = (double) summ / arrList.size();
        System.out.println("Минимальное: " + minEl);
        System.out.println("Максимальное: " + maxEl);
        System.out.println("Среднее арифметическое: " + arthMean + "\n");
    }
}