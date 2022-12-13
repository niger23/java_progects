// Реализовать простой калькулятор

package HomeWorks.Homeworks001;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите пример: ");
        String m[] = iScanner.nextLine().split("(?<!\\d)|(?!\\d)");
        iScanner.close();
        int res = 0;
        if (m[1].equals("*")) res = Integer.parseInt(m[0])*Integer.parseInt(m[2]);
        if (m[1].equals("/")) res = Integer.parseInt(m[0])/Integer.parseInt(m[2]);
        if (m[1].equals("+")) res = Integer.parseInt(m[0])+Integer.parseInt(m[2]);
        if (m[1].equals("-")) res = Integer.parseInt(m[0])-Integer.parseInt(m[2]);
        System.out.printf("%s %s %s = %d",m[0],m[1],m[2],res);
    }
    
}
