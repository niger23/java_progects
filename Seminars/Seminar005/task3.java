package Seminars.Seminar005;

public class task3 {
    public static void main(String[] args) {
        int num = 2922;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num/1000; i++) {
            sb.append("M");
        }
        num = num%1000;
        if (num/100 >= 9) {
            sb.append("CM");
            num -=900;
        }
        for (int i = 0; i < num/500; i++) {
            sb.append("D");
        }
        num = num%500;
        for (int i = 0; i < num/100; i++) {
            sb.append("C");
        }
        num = num%100;
        for (int i = 0; i < num/50; i++) {
            sb.append("L");
        }
        num = num%50;
        for (int i = 0; i < num/10; i++) {
            sb.append("X");
        }
        num = num%10;
        for (int i = 0; i < num/5; i++) {
            sb.append("V");
        }
        num = num%5;
        for (int i = 0; i < num/1; i++) {
            sb.append("I");
        }
        num = num%1;


        System.out.println(sb);
    }
    
}
