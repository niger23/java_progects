package Seminars.Seminar010;

public class Program {
    public static void main(String[] args) {
        Worker w = new Worker(1, "John");
        Integer d = 1234;
        String s = "String";

        String ss = """
            {
                "id": 1,
                "name": "John"
            }
                """;
        System.out.println(JSON.Marshal(w));
        System.out.println(JSON.Marshal(s));
        System.out.println(JSON.Marshal(d));

        System.out.println("---------");

        System.out.println(JSON.UnMarshal("10"));
        System.out.println(JSON.UnMarshal("\"string\""));
        System.out.println(JSON.UnMarshal(ss));

    }
}
