package string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateInString {
    public static void main(String[] args) {
//        HashMap<Character, Integer> hashmap = new HashMap<>();
//        String str = "Great responsibility";
//        for (char i : str.toCharArray()){
//          if (hashmap.containsKey(i)){
//              hashmap.put(i, hashmap.get(i)+1);
//          } else {
//              hashmap.put(i,1);
//          }
//
//        }
//        // After filling the hashmap with character counts
//        for (Map.Entry<Character, Integer> entry : hashmap.entrySet()) {
//            if (entry.getValue() > 1) {  // Check if the count is greater than 1 (duplicate)
//                System.out.println("Duplicate character: " + entry.getKey() + " appears " + entry.getValue() + " times.");
//            }
//        }

   String str = "hello ArAjun";
   char chararrystr[] = str.toCharArray();
   int count;
        for (int i = 0; i < chararrystr.length ; i++) {
            count = 1;
            for (int j = i+1; j <chararrystr.length ; j++) {
                if (chararrystr[i] == chararrystr[j] && chararrystr[i]!=' '&&  chararrystr[i] != '0' ){
                    count = count +1;
                    chararrystr[j] = '0';
                }

                }
            if (count >1 ) {
                System.out.println(chararrystr[i]+ " = " + count );
            }
            }

        }
    }

