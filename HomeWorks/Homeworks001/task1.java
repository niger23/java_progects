// Вычислить n-ое треугольного число(сумма чисел от 1 до n),
//  n! (произведение чисел от 1 до n)

package HomeWorks.Homeworks001;
import java.util.Scanner;


public class task1 {
    public static void main(String[] args) {
        int num = 0;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число N: ");
        boolean flag = iScanner.hasNextInt();
        if (flag == true) {     
            num = iScanner.nextInt();
        } else {
            System.out.println("Введено не число!"); 
        }
        iScanner.close();
        
        int triangularNum = num*(num+1)/2;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.printf("Треугольное число, числа %d равно: %d\n",num,triangularNum);
        System.out.printf("Факториал числа %d равен: %d",num,factorial);
    }
}
