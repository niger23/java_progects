// Даны 2 строки, написать метод, который вернет true, 
// если эти строки являются изоморфными и false, если нет. 
// Строки изоморфны, если одну букву в первом слове можно 
// заменить на некоторую букву во втором слове, при этом
// повторяющиеся буквы одного слова меняются на одну и 
// ту же букву с сохранением порядка следования. (Например, 
// add - egg изоморфны)
// буква может не меняться, а остаться такой же. (Например, 
// note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true

package Seminars.Seminar005;

import java.util.HashMap;

public class task1 {
    public static void main(String[] args) {
        String s1 = "for";
        String s2 = "ban";
        System.out.printf("%s %s\n%s", s1,s2,isIsomorphic(s1, s2));
        
    }
    public static boolean isIsomorphic (String s1 , String s2){
        if (s1 == null || s2 == null){
            throw new IllegalArgumentException();
        }
        if (s1.length() != s2.length()){
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0 ; i < s1.length(); i++){
            if (!map.containsKey(s1.charAt(i))){
                if(map.containsValue(s2.charAt(i))){
                    return false;
                }
                else{
                    map.put(s1.charAt(i), s2.charAt(i));
                }
            }
            else{
                if( map.get(s1.charAt(i)) != s2.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}
