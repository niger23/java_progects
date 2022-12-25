// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.

package Seminars.Seminar004;

import java.util.LinkedList;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        LinkedList<String> teList = new LinkedList<String>();
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.printf("Введите текст: ");
            String textInput = iScanner.next();
            
            if (!textInput.equals("print") && !textInput.equals("stop") && !textInput.equals("revert")) {
                System.out.printf("Добавлена новая запись: %s\n",textInput);
                teList.addFirst(textInput);
                
                // System.out.println(teList);
            } else if (textInput.equals("stop")) {
                System.out.println("Приложение остановлено, итоговый список: \n");
                System.out.println(teList);
                break;
            } else if (textInput.equals("revert")) {
                System.out.printf("Удалена последняя добавленная строка: %s\n",teList.get(0));
                teList.removeFirst();
            } else {
                for (int i = 0; i < teList.size(); i++) {
                    System.out.println(teList.get(i));
                }

            }
        }
        iScanner.close();
    }
}
