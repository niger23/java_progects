// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

package HomeWorks.HomeWorks004;

import java.util.LinkedList;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        LinkedList<String> teList = new LinkedList<String>();
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Доступные команды:\ndequeue - показывает первый элемент очереди и удаляет его;\nfirst - показывает первый элемент очереди;\nprint - показать список;\nstop - остановить приложение;");
        while (true) {
            System.out.printf("Введите команду или текст для добавления в 'очередь': ");
            String m = iScanner.next();
            
            if (!m.equals("dequeue") && !m.equals("first") && !m.equals("stop") && !m.equals("print")) {
                teList = enqueue(teList, m);
            } else if (m.equals("stop")) {
                System.out.println(teList);
                break;
            } else if (m.equals("dequeue")) {
                teList = dequeue(teList);
            } else if (m.equals("first")) {
                first(teList);
            } else if (m.equals("print")) {
                System.out.println(teList);
            }
        }
        iScanner.close();
    }
    public static LinkedList<String> enqueue(LinkedList<String> teList, String m) {
        teList.add(m);
        System.out.printf("В список добавлен элемент: %s\n",m);
        return teList;               
    }
    public static LinkedList<String> dequeue(LinkedList<String> teList) {
        System.out.printf("Из списока удалён элемент: %s\n",teList.get(0));
        teList.remove(0);
        return teList; 
    }
    public static void first(LinkedList<String> teList) {
        System.out.printf("Первый элемент очереди: %s\n",teList.get(0));
    }
    
}
