package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelStringRemove {
    public static void main(String[] args) {
        String str1 = "welcome to geeksforgeeks";
        Pattern pattern = Pattern.compile("[aeiouAEIOU]");


        for (int i = 0; i <str1.length() ; i++) {
            String curchar = String.valueOf(str1.charAt(i));
            Matcher matcher = pattern.matcher(curchar);
            if (!matcher.find()){
                System.out.print(curchar);
            }

        }

    }
}
