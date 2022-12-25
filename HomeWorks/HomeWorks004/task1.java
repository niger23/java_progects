// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package HomeWorks.HomeWorks004;

import java.util.LinkedList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        String[] inputText = input();
        LinkedList<String> teList = new LinkedList<String>();
        for (int i = 0; i < inputText.length; i++) {
            teList.add(inputText[i]);
        }
        System.out.printf("Исходный список: \n%s\n", teList);
        teList = reverseList(teList);
        System.out.printf("'Перевёрнутый' список: \n%s", teList);
    }
    public static String[] input() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите элементы массива в строку, через пробел: ");
        String[] textInput = iScanner.nextLine().split(" ");
        iScanner.close();

        return textInput;  
    }
    public static LinkedList<String> reverseList(LinkedList<String> teList) {
        for (int i = 0; i < teList.size()/2; i++) {
            String temp = teList.get(i);
            teList.set(i, teList.get(teList.size()-1-i));
            teList.set(teList.size()-1-i, temp);
        }
        return teList; 
    }
}
