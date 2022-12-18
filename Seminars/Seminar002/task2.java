package Seminars.Seminar002;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        String newText = input();
        StringBuilder result = new StringBuilder();
        char[] newTextChar = newText.toCharArray();
        int count = 1;
        for (int i = 1; i < newTextChar.length; i++) {
            if (newTextChar[i-1] == newTextChar[i]){
                count++;
                if (i == (newTextChar.length-1)){
                    result.append(newTextChar[i]);
                    result.append(count);
                }
            } else {
                result.append(newTextChar[i-1]);
                result.append(count);
                count = 1;
                if (i == (newTextChar.length-1)){
                    result.append(newTextChar[i]);
                    result.append(count);
                }
            }
        }
        System.out.println(result);


    }
    public static String input() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите текст: ");
        String textInput = iScanner.next();
        iScanner.close();
        return textInput;
    }
    
}
