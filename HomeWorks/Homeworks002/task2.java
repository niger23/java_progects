// Реализуйте алгоритм сортировки пузырьком числового 
// массива, результат после каждой итерации запишите в лог-файл.

package HomeWorks.Homeworks002;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;



public class task2 {
    public static void main(String[] args) {
        int[] newArr = createArray();
        System.out.println(Arrays.toString(newArr));
        int temp;
        for (int j = 0; j < newArr.length; j++) {
            for (int i = 1; i < newArr.length; i++) {
                if (newArr[i-1] > newArr[i]) {
                    temp = newArr[i-1];
                    newArr[i-1] = newArr[i];
                    newArr[i] = temp;
                    logger(Arrays.toString(newArr));
                }
            }
        }
        System.out.println(Arrays.toString(newArr));
    
    }
    
    public static int[] createArray() {
        int num = 0;
        int[] newArr;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите размер сортируемого массива: ");
        boolean flag = iScanner.hasNextInt();
        if (flag == true) {     
            num = iScanner.nextInt();
            newArr = new int[num];
            for (int i = 0; i < newArr.length; i++) {
                Random random = new Random();
                newArr[i] = random.nextInt(99);
            }
        } else {
            System.out.println("Введено не число!"); 
            iScanner.next();
            newArr = createArray();
        }
        iScanner.close();
        return newArr;
        
    }

    public static void logger(String textTest) {
        try (FileWriter fw = new FileWriter("HomeWorks/Homeworks002/logTask2.txt", true)) {
            fw.write(textTest + "\n");
            fw.flush();
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    
    }
}
