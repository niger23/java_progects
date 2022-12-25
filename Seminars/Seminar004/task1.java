// Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида
// text~num
// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

package Seminars.Seminar004;

import java.util.LinkedList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        LinkedList<String> teList = new LinkedList<String>();
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.printf("Введите текст в формате text~num: ");
            String m[] = iScanner.nextLine().split("~");
            
            if (!m[0].equals("print") && !m[0].equals("stop")) {
                if (Integer.parseInt(m[1])+1 > teList.size()) {
                    for (int i = teList.size(); i <= Integer.parseInt(m[1]); i++) {
                        teList.add(i, " ");
                    }
                }
                
                teList.set(Integer.parseInt(m[1]), m[0]);
                System.out.println(teList);
            } else if (m[0].equals("stop")) {
                System.out.println(teList);
                break;
            } else {
                System.out.println(teList.get(Integer.parseInt(m[1])));
                teList.set(Integer.parseInt(m[1]), " ");
                System.out.println(teList);
            }
        }
        iScanner.close();
        
    }
    
}
