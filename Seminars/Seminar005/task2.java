// Написать метод, который переведет число из римского формата 
// записи в арабский.
// Например, MMXXII = 2022

package Seminars.Seminar005;

import java.util.HashMap;

public class task2 {
    public static void main(String[] args) {
        String[] arab = "MMCMLXXXIX".split("");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("M", 1000);
        map.put("D", 500);
        map.put("C", 100);
        map.put("L", 50);
        map.put("X", 10);
        map.put("V", 5);
        map.put("I", 1);
        int sum = 0;
        for (int i = 0; i < arab.length-1; i++) {
            if (map.get(arab[i]) >= map.get(arab[i+1])) {
                sum += map.get(arab[i]);
            } else {
                sum = sum - map.get(arab[i]);
            }
            if (i == arab.length-2) {
                sum += map.get(arab[i+1]);
            }
        }
        System.out.println(sum);

    }
}
