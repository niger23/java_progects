package Seminars.Seminar005;


import java.util.HashMap;

public class task0 {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(123456,"Ivanov");
        employees.put(321456,"Vasiliev");
        employees.put(234561,"Petrova");
        employees.put(234432,"Ivanov");
        employees.put(654321,"Petrova");
        employees.put(345678,"Ivanov");
        for (java.util.Map.Entry<Integer, String> entry : employees.entrySet()) {
            if(entry.getValue().equals("Ivanov")) {
                System.out.printf("%d %s\n", entry.getKey(), entry.getValue());
            }
        }
    }
    
}
