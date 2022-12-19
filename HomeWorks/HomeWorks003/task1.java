// Реализовать алгоритм сортировки слиянием

package HomeWorks.HomeWorks003;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        int [] array = createArray();
        System.out.println("Создали список чисел: ");
        System.out.println(Arrays.toString(array));
        array = mergesort(array);
        System.out.println("Отсортированный список: ");
        System.out.println(Arrays.toString(array));
    }

    public static int[] mergesort(int[] newArray) {
      int n = newArray.length;
      if (n <= 1) return newArray;
  
      int[] leftArray = mergesort(Arrays.copyOfRange(newArray, 0, n / 2));
      int[] rightArray = mergesort(Arrays.copyOfRange(newArray, n / 2, n));
  
      return merge(leftArray, rightArray);
    }
  
    private static int[] merge(int[] leftArr, int[] rightArr) {
      int lenLeftArr = leftArr.length, lenRightArr = rightArr.length;
      int n = lenLeftArr + lenRightArr, i1 = 0, i2 = 0;
      int[] resultArr = new int[n];
  
      for (int i = 0; i < n; i++) {
        if (i1 == lenLeftArr) {
          resultArr[i] = rightArr[i2++];
        } else if (i2 == lenRightArr) {
          resultArr[i] = leftArr[i1++];
        } else {
          if (leftArr[i1] < rightArr[i2]) {
            resultArr[i] = leftArr[i1++];
          } else {
            resultArr[i] = rightArr[i2++];
          }
        }
      }
      return resultArr;
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
                newArr[i] = random.nextInt(100);
            }
        } else {
            System.out.println("Введено не число!"); 
            iScanner.next();
            newArr = createArray();
        }
        iScanner.close();
        return newArr;
  }
}