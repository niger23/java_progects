// 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.

package Seminars.Seminar004;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите элементы массива в строку, через пробел: ");
        String[] textInput = iScanner.nextLine().split(" ");
        iScanner.close();
        outPrintStack(textInput);
        System.out.println("========");
        outPrintQueue(textInput);
        
    }
    public static void outPrintStack(String[] texts) {
        Stack <String> teList = new Stack<>();
        for (int i = 0; i < texts.length; i++) {
            teList.push(texts[i]);
        }
        for (String string : teList) {
            System.out.println(string);
        }
    }
    public static void outPrintQueue(String[] texts) {
        Deque <String> teList = new ArrayDeque<>();
            

        for (int i = 0; i < texts.length; i++) {
            teList.add(texts[i]);
        }
        // for (String string : teList) {
        //     System.out.println(string);
        // }
        while (teList.size() != 0) {
            System.out.println(teList.pollFirst());
        }

    }
}
