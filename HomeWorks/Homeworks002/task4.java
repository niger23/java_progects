// К калькулятору из предыдущего дз добавить логирование.

package HomeWorks.Homeworks002;

// import java.time.LocalTime;
import java.util.Calendar;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class task4 {
    public static void main(String[] args) {
        StringBuilder log = new StringBuilder();
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите пример: ");
        String m[] = iScanner.nextLine().split("(?<!\\d)|(?!\\d)");
        iScanner.close();
        int res = 0;
        if (m[1].equals("*")) res = Integer.parseInt(m[0])*Integer.parseInt(m[2]);
        if (m[1].equals("/")) res = Integer.parseInt(m[0])/Integer.parseInt(m[2]);
        if (m[1].equals("+")) res = Integer.parseInt(m[0])+Integer.parseInt(m[2]);
        if (m[1].equals("-")) res = Integer.parseInt(m[0])-Integer.parseInt(m[2]);
        log.append(m[0] + m[1] + m[2] + " = " + res);
        logger(log.toString());
        System.out.printf("%s %s %s = %d",m[0],m[1],m[2],res);
    }

    public static void logger(String textTest) {
        try (FileWriter fw = new FileWriter("HomeWorks/Homeworks002/logTask4.txt", true)) {
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
            fw.write(timeStamp + " - the user calculated: " + textTest + "\n");
            fw.flush();
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    
    }
}