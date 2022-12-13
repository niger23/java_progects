package Seminars.Seminar001;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.printf("Введите ваше имя: ");    
        String name = iScanner.next();
        System.out.printf("Привет, " + name + "!");  
        iScanner.close();
    }
}

