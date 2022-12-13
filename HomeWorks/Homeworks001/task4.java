// *Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, 
// например 2? + ?5 = 69. Требуется восстановить выражение 
// до верного равенства. Предложить хотя бы одно 
// решение или сообщить, что его нет.

package HomeWorks.Homeworks001;
import java.util.Scanner;
import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите пример в формате q + w = e: \n где часть символов можно заменить знаком '?': ");
        String m[] = iScanner.nextLine().split("[\\+=]");
        for (int i = 0; i < m.length; i++) {
            m[i] = m[i].replaceAll("\\s+","");
        }
        iScanner.close();
        int count = 0;
        System.out.println(Arrays.toString(m));

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int num1 = Integer.parseInt(m[0].replaceAll("\\?", Integer.toString(i)));
                int num2 = Integer.parseInt(m[1].replaceAll("\\?", Integer.toString(j)));

                if ((num1+num2) == Integer.parseInt(m[2])) {
                    System.out.printf("%s + %s = %s\n", num1,num2,m[2]);
                    count++;
                    break;
                }
            }
            
        }
        if (count == 0) System.out.println("Решение не найдено!");

    }
}
