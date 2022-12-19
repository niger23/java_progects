// Пусть дан произвольный список целых чисел, удалить из него четные числа

package HomeWorks.HomeWorks003;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        ArrayList <Integer> newArray = createArray();
        System.out.println("Создали список чисел: ");
        System.out.println(newArray);
        System.out.println("Список без чётных чисел: ");
        System.out.println(deleteEven(newArray));

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

    public static ArrayList <Integer> deleteEven(ArrayList <Integer> newArray) {
        for (int i = 0; i < newArray.size(); i++) {
            if ( (int) newArray.get(i) % 2 == 0) {
                newArray.remove(i);
                i--;
            }           
        }
        return newArray;
    }
}

