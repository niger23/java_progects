// Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.


package Seminars.Seminar006;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> res = createSet();
        System.out.printf("Процент уникальных значений %s", unique(res));
        
    }
    public static ArrayList<Integer> createSet() {
        ArrayList<Integer> randomNumber = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            randomNumber.add(new Random().nextInt(25));
        }
        return randomNumber;
    }
    public static double unique(ArrayList<Integer> res) {
        HashSet<Integer> resSet = new HashSet<>(res);
        return ((double) resSet.size()/(double) res.size()) * 100;
    }
}
