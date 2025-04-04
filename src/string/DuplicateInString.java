package string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateInString {
    public static void main(String[] args) {
        HashMap<Character, Integer> hashmap = new HashMap<>();
        String str = "Great responsibility";
        for (char i : str.toCharArray()){
          if (hashmap.containsKey(i)){
              hashmap.put(i, hashmap.get(i)+1);
          } else {
              hashmap.put(i,1);
          }

        }
        // After filling the hashmap with character counts
        for (Map.Entry<Character, Integer> entry : hashmap.entrySet()) {
            if (entry.getValue() > 1) {  // Check if the count is greater than 1 (duplicate)
                System.out.println("Duplicate character: " + entry.getKey() + " appears " + entry.getValue() + " times.");
            }
        }



    }
}
