package string;

public class StringReplace {
    public static void main(String[] args) {
        String sen = "Arjun want to switch company";
        char re = '-';
        sen = sen.replace(' ',re);
        System.out.println(sen);
    }
}
