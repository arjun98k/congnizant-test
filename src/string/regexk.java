package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexk {
    public static void main(String[] args) {
        String input = "Arjun123 and zip code is 45";

        Pattern pat = Pattern.compile("\\d+");
        Matcher matcher =pat.matcher(input);


        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
