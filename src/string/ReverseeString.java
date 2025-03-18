package string;


public class ReverseeString {

    static String reverse(String inputstring){
        String reversestring = "";

        for (int i= inputstring.length()-1; i>=0; i--) {
            reversestring+= inputstring.charAt(i);
        }
        return reversestring;
    }
    public static void main(String[] args) {
     String answ = "Arjun";
        System.out.println(reverse(answ));
    }
}
