// Напишите метод, который составит строку, 
// состоящую из 100 повторений слова TEST и метод, 
// который запишет эту строку в простой текстовый файл, 
// обработайте исключения.

package Seminars.Seminar002;

import java.io.FileWriter;
import java.io.IOException;

public class task4 {
    public static void main(String[] args) {
        String textTest = writeTest();
        saveFile(textTest);

    }

    public static String writeTest() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            result.append("TEST");
        }
        String newResult = result.toString();
        return newResult;
    }

    public static void saveFile(String textTest) {
        try (FileWriter fw = new FileWriter("Seminars/Seminar002/file.txt", false)) {
            fw.write(textTest);
            fw.flush();
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
// public static void WriteStringToFile(String s, String filepath) throws Exception {
//     File f = new File(filepath);
//     FileWriter fw = new FileWriter(f);
//     fw.write(s);
//     fw.flush();
//     fw.close();
//     }
    