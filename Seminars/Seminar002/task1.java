package Seminars.Seminar002;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int n = input();
        char c1 = 'x';
        char c2 = 'y';
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(i%2 == 0 ? c1 : c2);
        }
        System.out.println(result);

    }
    public static int input() {
        int num = 0;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число N: ");
        if (iScanner.hasNextInt()) {     
            num = iScanner.nextInt();
        } else {
            System.out.println("Введено не число!"); 
            iScanner.next();
            num = input();
        }
        iScanner.close();
        return num;
        
    }
    
}
