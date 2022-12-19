// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее из этого списка.

package HomeWorks.HomeWorks003;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        ArrayList <Integer> newArray = createArray();
        System.out.println("Создали список чисел: ");
        System.out.println(newArray);
        MinMaxMean(newArray);
    }
    public static void MinMaxMean(ArrayList <Integer> newArray) {
        int min, sum, max;
        max = sum = min =  newArray.get(0);
        double mean;
        for (int i = 1; i < newArray.size(); i++) {
            if (min > newArray.get(i)) min = newArray.get(i);
            if (max < newArray.get(i)) max = newArray.get(i);
            sum += newArray.get(i);
        }
        mean = (double) sum/newArray.size();
        System.out.printf("Минимальное значение: %d\nМаксимальное значение: %d\nСреднее значение: %.2f", min,max,mean);
    }
    public static ArrayList <Integer> createArray() {
        int num = 0;
        ArrayList <Integer> randomArray = new ArrayList<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите размер массива: ");
        boolean flag = iScanner.hasNextInt();
        if (flag == true) {     
            num = iScanner.nextInt();
            for (int i = 0; i < num; i++) {
                randomArray.add(new Random().nextInt(100));
            }
        } else {
            System.out.println("Введено не число!"); 
            iScanner.next();
            randomArray = createArray();
        }
        iScanner.close();
        return randomArray;
    }
}
