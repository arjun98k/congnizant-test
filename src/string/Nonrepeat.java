package string;


import java.util.HashMap;
import java.util.Map;

public class Nonrepeat {
    public static char NonrepeatString(String s){
        Map<Character,Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < s.length() ; i++) {
            char c = s.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c,0)+1);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (frequencyMap.get(c) == 1){
                return c;
            }
        }
        char $=0;
        return $;
    }
    public static void main(String[] args) {
        System.out.println(NonrepeatString("geeksforgeeks"));
    }
}
