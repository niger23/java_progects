package Seminars.Seminar001;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        boolean flag = iScanner.hasNextInt();
        if (flag == true) {     
            num = iScanner.nextInt();
        } else {
            System.out.println("Введено не число"); 
        }
        iScanner.close();
        
        while (num != 0) {
            if (num > 0) {
                sum += num%10;
                num = num/10;
            }
        }
        System.out.printf("Сумма цифр числа равна: %d", sum);
    }
}
