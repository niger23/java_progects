package Seminars.Seminar001;
import java.time.LocalTime;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.printf("Введите ваше имя: ");
        String name = iScanner.next();
        int get_time = LocalTime.now().getHour();
        if (get_time > 6 && get_time <=12) {
            System.out.printf("Доброе утро, " + name + "!");  
        }    
        if (get_time > 12 && get_time <=18) {
            System.out.printf("Добрый день, " + name + "!");  
        } 
        if (get_time > 18 && get_time <=24) {
            System.out.printf("Добрый вечер, " + name + "!");  
        } 
        if (get_time > 24 && get_time <=6) {
            System.out.printf("Доброй ночи, " + name + "!");  
        } 
        iScanner.close();
    }
}

