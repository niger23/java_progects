// Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом (возвращает boolean значение).


package Seminars.Seminar002;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        String newText = input();
        boolean result = isPali(newText);
        if (result) {
            System.out.println("Введённый тест - палиндром!");
        } else {
            System.out.println("Введённый тест - не палиндром!");
        }
        
    }
    
    public static boolean isPali (String newText) {
        char[] newTextChar = newText.toCharArray();
        for (int i = 0; i < newTextChar.length/2; i++) {
            if (newTextChar[i] != newTextChar[newTextChar.length-i-1]){
                return false;
            }
        }
        return true;

    }

    public static String input() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите текст: ");
        String textInput = iScanner.next();
        iScanner.close();
        return textInput;
    }
}
