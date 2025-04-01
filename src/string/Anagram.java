package string;


import java.util.Arrays;

public class Anagram {
    public static boolean anagramfind(String str1, String str2){
        if (str1.length() != str2.length()){
            System.out.println("not anagram");
            return false;
        }

        char chararr1[] = str1.toCharArray();
        char chararr2[] = str2.toCharArray();
        Arrays.sort(chararr1);
        Arrays.sort(chararr2);

        if (String.valueOf(chararr1).equals(String.valueOf(chararr2))){
            System.out.println("it is anagram");
            return  true;
        }  else {
            System.out.println("not an anagram");
        }
        return false;
    }
    public static void main(String[] args) {
        anagramfind("grab","brad");
    }
}
