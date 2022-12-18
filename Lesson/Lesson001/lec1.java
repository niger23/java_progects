package Lesson.Lesson001;
import java.util.Scanner;
public class lec1 {
   public static void main(String[] args) {
       Scanner iScanner = new Scanner(System.in);
       System.out.printf("int a: ");
       boolean flag = iScanner.hasNextInt();
       if (flag == true) {
        // System.out.println(flag);       
        int i = iScanner.nextInt();
        System.out.println(i); 
    } else {
        System.out.println("Введено не число"); 
       }
    
       iScanner.close();
   } }


// Вывод
// int a = 1, b = 2;
// int c = a + b;
// String res = String.format("%d + %d = %d \n", a, b, c);
// System.out.printf("%d + %d = %d \n", a, b, c);
// System.out.println(res);

// Тернарный оператор
// int a = 1;
// int b = 2;
// int min = a < b ? a : b;
// System.out.println(min);

// Оператор выбора
// int mounth = value;
//         String text = "";
//         switch (mounth) {
//             case 1:
//                 text = "Autumn";
//                 break;
// 		...
//             default:
//                 text = "mistake";
//                 break;

// работа с файлами
// import java.io.FileWriter;
// import java.io.IOException;
// public class program {
//     public static void main(String[] args) {
//         try (FileWriter fw = new FileWriter("file.txt", false)) {
//             fw.write("line 1");
//             fw.append('\n');
//             fw.append('2');
//             fw.append('\n');
//             fw.write("line 3");
//             fw.flush();
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     } }

