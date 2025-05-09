package string;

import java.util.HashMap;
import java.util.Map;

public class FindMaxOccurChar {
public static int findmax(String str){
    int maxcount = 0;
    char maxChar = ' ';
    for (int i = 0; i <str.length() ; i++) {
        int count = 0;
        for (int j = 0; j < str.length() ; j++) {
            if (str.charAt(i) == str.charAt(j)){
                count+=1;
            }

            }
        if (count>maxcount){
            maxcount  =  count;
            maxChar = str.charAt(i);

        }
    }
    System.out.println("Max occurring character: " + maxChar);
    return maxcount;

}

public  static int maxChar(String str1){
    HashMap<Character, Integer> countcharr = new HashMap<>();

    for (int i = 0; i < str1.length() ; i++) {
        char ch = str1.charAt(i);
        countcharr.put(ch,countcharr.getOrDefault(ch,0) +1);
    }
    int maxCount = 0;
    char Maxchar = ' ';

    for (Map.Entry<Character,Integer> entry : countcharr.entrySet()){
        if (entry.getValue()>maxCount){
            Maxchar = entry.getKey();
            maxCount = entry.getValue();
        }
    }
    System.out.println(Maxchar);
    return maxCount;
}

    public static void main(String[] args) {

//    System.out.println(findmax("geeksforgeeks"));
        System.out.println(maxChar("geeksforgeeks"));
    }
}
