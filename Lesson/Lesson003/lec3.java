package Lesson.Lesson003;

// import java.util.ArrayList;
import java.util.*;
// import java.util.Arrays;

public class lec3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list) { System.out.println(item); }
        
        Iterator<Integer> col = list.iterator();
 
        while (col.hasNext()) {
            System.out.println(col.next());
        }
 
 
 
    }
    
}
